package jdbc.advancedrs;

import javax.sql.DataSource;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
