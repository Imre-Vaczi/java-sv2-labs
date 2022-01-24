package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> answers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> answers) {
        this.answers = answers;
    }

    public Set<String> drawWinners() {
        Random random = new Random();
        Set<String> result = new LinkedHashSet<>();

        while (result.size() != 5) {

            if (answers.size()==0) {
                throw new IllegalArgumentException("No more participant.");
            }
            RightAnswer draw = answers.get(random.nextInt(answers.size()));
            result.add(draw.getSolver());
            answers.remove(draw);
        }
        return result;
    }
}
