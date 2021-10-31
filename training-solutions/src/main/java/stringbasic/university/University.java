package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        boolean neptunCheck = student.getNeptunCode().equals(anotherStudent.getNeptunCode());
        boolean omCheck = student.getOmNumber().equals(anotherStudent.getOmNumber());
        return neptunCheck & omCheck;
    }
}
