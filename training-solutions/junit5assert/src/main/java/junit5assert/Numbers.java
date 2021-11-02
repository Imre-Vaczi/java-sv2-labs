package junit5assert;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public int[] getEvenNumbers(int[] numbers){
        List<Integer> evenResult = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenResult.add(numbers[i]);
            }else{evenResult.add(0);}
        }return getListIntoArray(evenResult);
    }
    public int[] getListIntoArray(List<Integer> numberList){
        int[] result = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++){
            result[i] = numberList.get(i);
        }return result;
    }
}
