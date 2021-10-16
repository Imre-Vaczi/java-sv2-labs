package classstructureio;
import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name: ");
        String name = scanner.nextLine();
        System.out.println("Please provide your e-mail address: ");
        String mail = scanner.nextLine();
        System.out.println("Please find the details of your registration below.");
        System.out.println("Your name: " + name );
        System.out.println("Your e-mail address: " + mail);

    }
}
