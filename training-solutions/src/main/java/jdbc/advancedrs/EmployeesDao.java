package jdbc.advancedrs;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into employees(emp_name) values(?)",
                        Statement.RETURN_GENERATED_KEYS)
                ) {
            ps.setString(1,name);
            ps.executeUpdate();
            return getIdByStatement(ps);
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert" ,sqlException);
        }
    }

    private long getIdByStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                long idToReturn = rs.getLong(1);
                return idToReturn;
            }
            throw new IllegalStateException("Can not get the ID.");
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert", sqlException);
        }
    }

    public void createEmployees(List<String> names) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement ps = conn.prepareStatement("insert into employees(emp_name) values(?);")) {
                for (String name : names) {
                    if (name.startsWith("x")) {
                        throw new IllegalArgumentException("Invalid input.");
                    }
                    ps.setString(1, name);
                    ps.executeUpdate();
                }
                conn.commit();
            }
            catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert.", sqlException);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees;")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query.", sqlException);
        }
    }

    public List<String> listOddEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("select emp_name from employees;")
        ) {
            if (!rs.next()) {
                return Collections.emptyList();
            }
            List<String> names = new ArrayList<>();
            names.add(rs.getString("emp_name")); //initializing
            while (rs.relative(2)) {
                names.add(rs.getString("emp_name"));
            }
            return names;
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query.");
        }
    }

    public void updateNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select id, emp_name from employees;")
        ) {
            while (rs.next()) {
                String name = rs.getString("emp_name");
                if (!name.startsWith("Jane")) {
                    rs.updateString("emp_name", "Mr. " + name);
                    rs.updateRow();
                }
            }
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert.", sqlException);
        }
    }

    public String findEmployeeNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?;")
        ) {
            ps.setLong(1, id);
            return selectNameByPreparedStatement(ps);
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not find ID.", sqlException);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getString("emp_name");
            }
            throw new IllegalArgumentException("Not found.");
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Issue", sqlException);
        }
    }
}
