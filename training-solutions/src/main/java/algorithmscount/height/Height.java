package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> inputList, int threshold) {
        int valueCount = 0;
        for (Integer kidHeight : inputList) {
            if (kidHeight > threshold) {
                valueCount++;
            }
        }
        return valueCount;
    }
}