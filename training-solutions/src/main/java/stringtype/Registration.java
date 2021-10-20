package stringtype;
import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("username: ");
        String username = scanner.nextLine();
        System.out.println("email: ");
        String email = scanner.nextLine();
        System.out.println("password: ");
        String password1 = scanner.nextLine();
        System.out.println("password again: ");
        String passwrod2 = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println("username correct: "+userValidator.isValidUsername(username));
        System.out.println("email correct: " + userValidator.isValidEmail(email));
        System.out.println("pass correct: "+userValidator.isValidPassword(password1,password1));

    }
}
