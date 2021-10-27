package intromethods.registration;
import java.util.Scanner;
import java.time.LocalDate;
public class Registration {

    public String nameGenerator(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public LocalDate dateGenerator(int year, int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Type in your last name");
        String lastName = scanner.nextLine();
        System.out.println("Year you were born in: ");
        int year = scanner.nextInt();
        System.out.println("Month you were born in: ");
        int month = scanner.nextInt();
        System.out.println("Day you were born on: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type in your e-mail address: ");
        String mail = scanner.nextLine();

        Registration registration = new Registration();

        String fullName = registration.nameGenerator(firstName,lastName);
        LocalDate dateOfBirth = registration.dateGenerator(year,month,day);

        Person person = new Person(fullName,dateOfBirth,mail);

        System.out.println(person.toString());
        }

    }