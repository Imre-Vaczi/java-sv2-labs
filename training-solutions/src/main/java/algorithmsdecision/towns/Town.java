package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> occupantsList, int upperThreshold) {
        boolean result = false;
        int i = 0;

        while ((i < occupantsList.size()) && !result) {
            if (occupantsList.get(i) < upperThreshold) {
                result = true;
            }
            i++;
        }
        return result;
    }
}
