package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int sumOfLegs = 0;
        for (Animal animal : animals) {
            sumOfLegs += animal.getNumberofLegs();
        }
        return sumOfLegs;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
