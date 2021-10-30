package references.dogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList(Arrays.asList());

        Dog kutyOne = new Dog("Aa", 1, "zsemle");
        dogs.add(kutyOne);

        Dog kutyTwo = new Dog("Bé", 2, "kakaó");
        dogs.add(kutyTwo);

        Dog kutyThree = new Dog("Cé", 3, "szén");
        dogs.add(kutyThree);

        System.out.println(dogs);

        Dog kutyFour = dogs.get(1);
        kutyFour.setColour("vaj");

        System.out.println(dogs);

        Dog kutyFive = new Dog("Dé", 5, "avar");
        System.out.println(kutyFive);

        kutyFive = dogs.get(1);
        System.out.println(kutyFive);

        dogs.add(kutyFive);
        System.out.println(dogs);

        Dog kutySix = kutyFour;
        kutySix.setColour("tarka");

        System.out.println(dogs);

        List<Dog> alterDogs = dogs;

        Dog kutySeven = kutyFour;
        kutySeven.setColour("mák");

        System.out.println(alterDogs);

        kutySeven.setColour("ében");
        System.out.println(alterDogs);

        kutyTwo = null;
        System.out.println(alterDogs);

        Dog kutyEight = dogs.get(1);
        kutyEight = null;
        System.out.println(alterDogs);

        Dog kutyNine = dogs.get(1);
        kutyNine.setColour("tiramisu");
        System.out.println(alterDogs);
    }
}
