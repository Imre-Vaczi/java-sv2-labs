package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> scores = new ArrayList<>();

    public List<Integer> getScores() {
        return scores;
    }

    public void addNote(int note) {
        if ((note > 0) & (note < 6)){
            this.scores.add(note);
        }
        throw new IllegalArgumentException("Note must be between 1 and 5!");
    }
}
