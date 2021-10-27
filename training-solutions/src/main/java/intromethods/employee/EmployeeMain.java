package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Lilu", 1999, 1000000);
        System.out.println(employee.toString());
        employee.raiseSalary(30000);
        System.out.println(employee.toString());
        }
    }
