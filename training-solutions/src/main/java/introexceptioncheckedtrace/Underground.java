package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {
    public static void main(String[] args) {
        String result = "";
        Operations operations = new Operations();

        try {
            result = operations.getDailySchedule(operations.readFile("underground.txt"));
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println(result);
    }
}
