package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (isNull(mark)) {
            throw new NullPointerException("Mark must not be null!");
        }
        this.marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        int countOfMarks = this.marks.size();
        double sumOfMarks = 0;
        for (Mark mark : marks) {
            sumOfMarks += mark.getMarkType().getValue();
        }
        return Math.round((sumOfMarks / (countOfMarks * 1.0)) * 100.0) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        if (marks.isEmpty()) {
            return 0.0;
        }
        int countOfMarks = 0;
        double sumOfMarks = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sumOfMarks += mark.getMarkType().getValue();
                countOfMarks ++;
            }
        }
        return Math.round((sumOfMarks / (countOfMarks * 1.0)) * 100.0) / 100.0;
    }

    public String toString() {
        return String.format("%s marks: %s: %s", this.name, this.marks.get(0).getSubject().getSubjectName() ,this.marks.get(0).toString());
    }

    private boolean isNull(Mark mark) {
        return mark == null;
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }
}
