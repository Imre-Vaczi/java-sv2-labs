package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                sb.append(getLetter(scanner.nextLine()));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not be read", ioe);
        }
        return sb.toString();
    }

    private String getLetter(String line) {
        String result = " ";
        for (Character element : line.toCharArray()) {
            if (Character.isLetter(element)) {
                result = String.valueOf(element);
            }
        }
        return result;
    }
}
