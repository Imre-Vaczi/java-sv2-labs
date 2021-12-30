package schoolrecords;

public class StudyResultByName {

    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        if (isEmpty(studentName)) {
            throw new IllegalArgumentException("String can not be empty!");
        }
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }
}
