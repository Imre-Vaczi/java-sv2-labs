package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> inputStringList) {
        List<String> transformedList = new ArrayList<>();

        for (String word : inputStringList) {
            transformedList.add(word.substring(0,2));
        }
        return transformedList;
    }
}
