package collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int temp = Integer.MAX_VALUE;
        for (Map.Entry applicant : applicants.entrySet()) {
            if ((Integer) applicant.getKey() < temp && (Integer) applicant.getKey() > lastNumber) {
                temp = (Integer) applicant.getKey();
            }
        }
        return applicants.get(temp);
    }
}
