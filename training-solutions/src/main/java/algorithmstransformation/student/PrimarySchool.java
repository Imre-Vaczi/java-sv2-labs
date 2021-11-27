package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> allPeopleInSchool = new ArrayList<>();

    public PrimarySchool(List<Person> allPeopleInSchool) {
        this.allPeopleInSchool = allPeopleInSchool;
    }

    public void addPerson(Person person) {
        this.allPeopleInSchool.add(person);
    }

    public List<Person> getAllPeopleInSchool() {
        return allPeopleInSchool;
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        for (Person individual : this.allPeopleInSchool) {
            if ((individual.getAge() > 6) && (individual.getAge() < 14)) {
                students.add(new Student(individual.getName(),individual.getAddress()));
            }
        }
        return students;
    }
}
