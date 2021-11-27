package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animalList = new ArrayList<>();

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal species : this.animalList) {
            if (species.getNumberOfLegs() == numberOfLegs) {
                filteredAnimals.add(species);
            }
        }
        return filteredAnimals;
    }

    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
