package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> inputList) {
        Integer tempMin = Integer.MAX_VALUE;
        for (Integer i : inputList) {
            if (i < tempMin) {
                tempMin = i;
            }
        }
        return tempMin;
    }
}
