package methodoverloading;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static javax.swing.UIManager.get;

public class ClassFiveA {

    private List<String> listOfStudents = new ArrayList<>();

    public void addStudent(String student) {
        if ("".equals(student) || student == null) {
            throw new IllegalArgumentException("Student can not be empty or null.");
        }
        listOfStudents.add(student);
    }

    public String getTodayReferringStudent(int number) {
        return listOfStudents.get(number-1);
    }

    public String getTodayReferringStudent(Number number) {
        return listOfStudents.get(number.getValue()-1);
    }

    public String getTodayReferringStudent(String numberName) {
        return listOfStudents.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
