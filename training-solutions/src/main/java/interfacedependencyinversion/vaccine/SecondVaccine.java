package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addYoungsters(registrated);
        addOldies(registrated);
    }

    private void addYoungsters(List<Person> registrated) {
        for (Person person : registrated) {
            if ((person.getPregnancy()== Pregnancy.NO) && (person.getAge() <= 65) && (person.getChronicDisease() == ChronicDisease.NO)) {
                vaccinationList.add(person);
            }
        }
    }

    private void addOldies(List<Person> registrated) {
        for (Person person : registrated) {
            if ((person.getPregnancy()== Pregnancy.NO) && (person.getAge() > 65) && (person.getChronicDisease() == ChronicDisease.NO)) {
                vaccinationList.add(person);
            }
        }
    }
}
