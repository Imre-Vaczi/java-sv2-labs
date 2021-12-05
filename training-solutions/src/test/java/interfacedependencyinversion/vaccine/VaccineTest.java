package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    @Test
    void testPerson() {
        Person person = new Person("a", 30, ChronicDisease.NO, Pregnancy.NO);
        assertEquals("a", person.getName());
        assertEquals(30, person.getAge());
        assertEquals(ChronicDisease.NO, person.getChronicDisease());
        assertEquals(Pregnancy.NO, person.getPregnancy());
    }

    Vaccine vaccine;
    List<Person> regList;

    @BeforeEach
    void settingUp() {
        regList = new ArrayList<Person>();
        regList.add(new Person("a", 30, ChronicDisease.NO, Pregnancy.NO));
        regList.add(new Person("b", 30, ChronicDisease.YES, Pregnancy.NO));
        regList.add(new Person("c", 30, ChronicDisease.NO, Pregnancy.YES));
        regList.add(new Person("d", 30, ChronicDisease.YES, Pregnancy.NO));
        regList.add(new Person("u", 70, ChronicDisease.NO, Pregnancy.NO));
        regList.add(new Person("x", 70, ChronicDisease.YES, Pregnancy.NO));
        regList.add(new Person("y", 70, ChronicDisease.NO, Pregnancy.NO));
        regList.add(new Person("z", 70, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void testVaccineFirst() {
        Vaccine vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(regList);
        assertNotNull(vaccine.getVaccinationList());
        assertEquals(8, vaccine.getVaccinationList().size());
    }

    @Test
    void testVaccineSecound() {
        Vaccine vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(regList);
        assertNotNull(vaccine.getVaccinationList());
        assertEquals(3, vaccine.getVaccinationList().size());
    }
}