package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public String getDailySchedule(List<String> inputList){
        StringBuilder sb = new StringBuilder().append(LocalDate.now()+", ");
        for (String item : inputList){
            if (Integer.parseInt(String.valueOf(item.charAt(0))) == 2){
                sb.append(item + ", ");
            }
        }
        return sb.substring(0,sb.length()-2).toString();
    }
}
