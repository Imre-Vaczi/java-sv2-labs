package jdbc.advancedrs;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
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

    //public List<String> listOddEmployeeNames() {}
}
