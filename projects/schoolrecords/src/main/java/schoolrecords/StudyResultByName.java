package schoolrecords;

public class StudyResultByName {

    private String name;
    private double average;

    public StudyResultByName(String name, double average) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("String can not be empty!");
        }
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }
}
