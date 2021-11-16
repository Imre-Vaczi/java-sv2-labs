package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String nameFinal = null;
        int ageFinal = 0;

        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Üdvözlet!");

        System.out.println("Kérjük adja meg a teljes nevét!");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
            nameFinal = name;
        }
        catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }

        System.out.println("Kérjük adja meg életkorát!");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
            ageFinal = Integer.parseInt(age);
        }
        catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

        System.out.println("Megadott név: " + name + "\nMegadott életkor: " + age);

        if ((nameFinal.length() > 0) & (ageFinal > 0)) {
            System.out.println("A regisztráció sikeresen lezárult.");
        }else{
            System.out.println("A regisztráció nem volt sikeres.");
        }
    }

}
