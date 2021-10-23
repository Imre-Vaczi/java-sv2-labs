package arraylist;

import java.util.List;
import java.util.Arrays;
public class Crossword {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        for (String item : words){
            if (item.length() == 6){
                System.out.print(item + " ");
            }
        }
    }
}
