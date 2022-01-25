package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> data) {
        Map<VoteResult, Integer> result = new HashMap<>();

        for (Map.Entry oneVote : data.entrySet()) {
            if (!result.containsKey(oneVote.getValue())) {
                VoteResult tempKey = (VoteResult) oneVote.getValue();
                result.put(tempKey, 1);
            } else {
                VoteResult tempKey = (VoteResult) oneVote.getValue();
                Integer newValue = result.get(tempKey) + 1;
                result.put(tempKey, newValue);
            }
        }

        return result;
    }
}
