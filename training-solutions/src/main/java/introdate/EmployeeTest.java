package introdate;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter year of birth:");
        int year = scanner.nextInt();
        System.out.println("Enter month of birth (with number):");
        int month = scanner.nextInt();
        System.out.println("Enter day of birth (with number):");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
    }

}
