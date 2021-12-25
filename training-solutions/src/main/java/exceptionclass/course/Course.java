package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime start;

    public Course(String name, SimpleTime start) {
        this.name = name;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getStart() {
        return start;
    }

    @Override
    public String toString() {
        return start.toString() + ": " + this.name;
    }
}
