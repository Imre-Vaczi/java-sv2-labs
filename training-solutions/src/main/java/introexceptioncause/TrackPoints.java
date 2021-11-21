package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch (IOException ioe){
            throw new IllegalStateException("Tartalom nem olvasható.", ioe);
        }
    }

    public List<Integer> readElevation(List<String> inputList) {
        List<Integer> result = new ArrayList<>();
        for (String row : inputList) {
            result.add(Integer.parseInt(row.substring(row.length()-3,row.length())));
        }
        return result;
    }

    public List<Integer> calculateElevDiff(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < intList.size(); i++){
            result.add(intList.get(i)-intList.get(i-1));
        }
        return result;
    }

    public void printElevDiff(List<Integer> diffs) {
        for (Integer diff : diffs) {
            System.out.println(diff);
        }
    }
}
