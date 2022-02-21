package jdbc.architecture;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into employees(emp_name) values(?);",
                        Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, name);
            ps.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert.", sqlException);
        }
    }

    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees;");
                ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query.", sqlException);
        }
    }

    public String findEmployeeNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?;")
                ) {
            ps.setLong(1, id);

            return selectNameByPreparedStatement(ps);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query.", sqlException);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalStateException("Not found.");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query", sqlException);
        }
    }

}
