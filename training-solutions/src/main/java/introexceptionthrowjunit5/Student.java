package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> scores = new ArrayList<>();

    public void addNote(int note) {
        if ((note < 6) && (note > 0)) {
            this.scores.add(note);
        }else{
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
    }

    public List<Integer> getScores() {
        return scores;
    }
}
