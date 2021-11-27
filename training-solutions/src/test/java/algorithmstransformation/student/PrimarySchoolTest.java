package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;

    @BeforeEach
    void generatingCases() {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("aaa", 40, "oooo"));
        listOfPeople.add(new Person("bbb", 10, "ssss"));
        listOfPeople.add(new Person("ccc", 7, "zzzz"));
        listOfPeople.add(new Person("ddd", 2, "xxxx"));

        primarySchool = new PrimarySchool(listOfPeople);
    }

    @Test
    void testGetAllPeopleInSchool() {
        assertEquals(4, primarySchool.getAllPeopleInSchool().size());
    }

    @Test
    void testAddPerson() {
        primarySchool.addPerson(new Person("eee", 20, "uuuu"));
        assertEquals(5, primarySchool.getAllPeopleInSchool().size());
    }

    @Test
    void testGetStudents() {
        List<Student> listOfStudents = primarySchool.getStudents();
        assertEquals(2, listOfStudents.size());
        assertEquals("bbb", listOfStudents.get(0).getName());
        assertEquals("ssss", listOfStudents.get(0).getAddress());
    }

}