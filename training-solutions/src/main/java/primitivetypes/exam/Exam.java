package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}
