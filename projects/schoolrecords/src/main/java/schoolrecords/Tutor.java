package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("String can not be empty!");
        }
        if (isNull(subjects)) {
            throw new IllegalArgumentException("The provided ArrayList can not be null!");
        }

        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject course : subjects) {
            if (course.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }

    private boolean isNull(List<Subject> subjects) {
        return subjects == null;
    }
}
