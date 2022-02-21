package jdbc.generatedid;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    EmployeesDao employeesDao;

    @BeforeEach
    void testInit() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
           dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
           dataSource.setUser("employees");
           dataSource.setPassword("employees");
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect.", sqlException);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    void testById() {
        long id = employeesDao.createEmployee("Jack Doe");
        System.out.println(id);
        id = employeesDao.createEmployee("Jane Doe");
        System.out.println(id);
        String name = employeesDao.findEmployeeNameById(id);
        assertEquals("Jane Doe", name);
    }

}