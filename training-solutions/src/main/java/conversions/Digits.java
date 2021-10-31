package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> digitlist = new ArrayList<>();

    public void addDigitsToList(String text){
        for (int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.toCharArray()[i])){
                digitlist.add(Character.getNumericValue(text.toCharArray()[i]));
            }
        }
    }

    public List<Integer> getDigitlist() {
        return digitlist;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("alm1al3ma");
        System.out.println(digits.getDigitlist());
    }

}
