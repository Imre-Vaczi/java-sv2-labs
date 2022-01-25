package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private List<ExamResult> results = new ArrayList<>();

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> modified = new ArrayList<>(results);
        Collections.sort(modified, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return Integer.valueOf(o1.getScore()).compareTo(o2.getScore());
            }
        });
        Collections.reverse(modified);
        return getChosenOnes(modified, places);
    }

    private List<String> getChosenOnes(List<ExamResult> chosenOnes, int places) {
        List<String> output = new ArrayList<>();
        if (places >= results.size()) {
            for (ExamResult res : chosenOnes) {
                output.add(res.getName());
            }
        } else {
            for (int i = 0; i < places; i++) {
                output.add(chosenOnes.get(i).getName());
            }
        }
        return output;
    }
}
