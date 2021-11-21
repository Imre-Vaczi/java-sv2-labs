package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();

        System.out.println("Recording data for birthday list:\nHow many record do you want to store?");
        int recordNumber = Integer.parseInt(scanner.nextLine());

        for ( int i = 0; i < recordNumber; i++) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Date of birth yyyy-mm-dd:");
            String dob = scanner.nextLine();
            data.add(name + " - " + dob);
        }

        try {
            Files.write(Paths.get("src/main/resources/birthdays.txt"), data);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error during writing procedure", ioe);
        }
    }
}
