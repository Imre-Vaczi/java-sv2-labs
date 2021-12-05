package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregies(registrated);
        addOldies(registrated);
        addResties(registrated);
    }

    private void addPregies(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getPregnancy() == Pregnancy.YES) {
                vaccinationList.add(person);
            }
        }
    }

    private void addOldies(List<Person> registrated) {
        for (Person person : registrated) {
            if ((person.getPregnancy()== Pregnancy.NO) && (person.getAge() > 65)) {
                vaccinationList.add(person);
            }
        }
    }

    private void addResties(List<Person> registrated) {
        for (Person person : registrated) {
            if ((person.getPregnancy()== Pregnancy.NO) && (person.getAge() <= 65)) {
                vaccinationList.add(person);
            }
        }
    }
}
