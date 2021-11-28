package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    private Results results;

    public Results sum(String floatingNumbers) {
        Results results = new Results();
        String[] tempWithDots = floatingNumbers.replace(',', '.').split(";");
            for (String s : tempWithDots) {
                double tempNumber = Double.parseDouble(s);
                if (tempNumber < 0.0) {
                    results.setSumOfNeg(results.getSumOfNeg() + tempNumber);
                } else {
                    results.setSumOfPos(results.getSumOfPos() + tempNumber);
                }
            }
        return results;
    }

    public String readFile(String path) {
        try {
            List<String> temp = Files.readAllLines(Paths.get(path));
            return temp.get(0);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File can not be read.");
        }
    }

    private String replaceSigns(String text) {
        return text.replace(',', '.');
    }

    private String[] updateStringArray(String[] stringArray) {
        String[] temp = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            temp[i] = replaceSigns(stringArray[i]);
        }
        return temp;
    }

 /*   public static void main(String[] args) {
        SeparatedSum separatedSum = new SeparatedSum();
        String patch = separatedSum.readFile("src/test/resources/floatingnumbers.txt");

        Results results = separatedSum.sum(patch);
        System.out.println(results.getSumOfNeg());
        System.out.println(results.getSumOfPos());
    }*/
}
