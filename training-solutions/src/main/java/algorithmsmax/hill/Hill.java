package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> inputList) {
        Integer tempMax = Integer.MIN_VALUE;
        for (Integer i : inputList) {
            if (i > tempMax) {
                tempMax = i;
            }
        }
        return tempMax;
    }
}
