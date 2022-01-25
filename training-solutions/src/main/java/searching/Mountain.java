package searching;

import java.util.Arrays;

public class Mountain {

    private int[] data;

    public Mountain(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public boolean searchPeak(Peak peak) {
        return Arrays.binarySearch(data, peak.getElevation()) >= -1;
    }
}
