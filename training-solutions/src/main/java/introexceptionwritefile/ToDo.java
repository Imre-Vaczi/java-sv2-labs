package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Please add tasks to the list line by line. \nIf there is no more to add, enter x");
        while (!(input.equals("x"))) {
            input = scanner.nextLine();
            toDoList.add(input);
        }

        toDoList.remove("x");

        try {
            Files.write(Paths.get("src/main/resources/todos.txt"), toDoList);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error during the writing procedure.", ioe);
        }

        System.out.println("Writing procedure is complete.");
    }
}
