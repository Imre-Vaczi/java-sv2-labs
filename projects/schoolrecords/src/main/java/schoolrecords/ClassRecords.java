package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if (isEmpty(className)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (isNull(random)) {
            throw new NullPointerException("Random must not be null!");
        }

        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public boolean addStudent(Student student) {
        if (!isInStudents(student)) {
            this.students.add(student);
            return true;
        } else {
            return false;
        }
    }

    public double calculateClassAverage() {
        if (students.size()==0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double studentCount = students.size();
        double studentAvgSum = 0;
        for (Student pupil : students) {
            studentAvgSum += pupil.calculateAverage();
        }
        if (studentAvgSum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round((studentAvgSum/(studentCount*1.0))*100.0)/100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.size()==0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double studentCount = 0;
        double studentAvgSum = 0;
        for (Student pupil : students) {
            if (pupil.calculateSubjectAverage(subject) > 0) {
                studentAvgSum += pupil.calculateSubjectAverage(subject);
                studentCount ++;
            }
        }
        if (studentAvgSum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round((studentAvgSum/(studentCount*1.0))*100.0)/100.0;
    }

    public boolean removeStudent(Student student) {
        if (getStudentIndex(student) >= 0) {
            students.remove(student);
            return true;
        } else {
            return false;
        }
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        Student found = null;
        for (Student pupil : students) {
            if (pupil.getName().equals(name)) {
                found = pupil;
            }
        }
        if (found == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return found;
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return this.students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> results = new ArrayList<>();
        for (Student pupil : students) {
            results.add(new StudyResultByName(pupil.getName(), pupil.calculateAverage()));
        }
        return results;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student pupil : students) {
            sb.append(pupil.getName()).append(", ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private boolean isNull(Random random) {
        return random == null;
    }

    private boolean isEmpty(String str) {
        return (str == null | str.length() == 0);
    }

    private boolean isInStudents(Student student) {
        for (Student pupil : students) {
            if (pupil.getName().equals(student.getName())) {
                return true;
            }
        }
        return false;
    }

    private int getStudentIndex(Student student) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (student.getName().equals(students.get(i).getName())) {
                index = i;
                return index;
            }
        }
        return index;
    }
}
