package schoolrecords;

public class Subject {

    private String subjectName;

    public Subject(String subjectName) {
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("String can not be empty!");
        }
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isEmpty(String str) {
        return str == null;
    }
}
