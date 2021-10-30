package primitivetypes.exam;
import java.time.LocalDate;
import java.util.Scanner;
public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration in progress...");
        System.out.println("    Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("    Please enter the year you were born in: ");
        String year = scanner.nextLine();
        System.out.println("    Please enter the month you were born in: ");
        String month = scanner.nextLine();
        System.out.println("    Please enter the day you were born on: ");
        String day = scanner.nextLine();
        System.out.println("    Please enter your zip code: ");
        String zip = scanner.nextLine();
        System.out.println("    Please enter your average score: ");
        String avg = scanner.nextLine();
        System.out.println("    ... processing ...");
        Exam exam = new Exam();

        LocalDate yob = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        double avgScore = Double.parseDouble(avg);

        Person person = new Person(name,yob,Integer.parseInt(zip),avgScore);
        System.out.println("Details of your profile: ");
        System.out.println(person.toString());
        exam.addPerson(person);
        System.out.println("Registration complete");
    }
}
