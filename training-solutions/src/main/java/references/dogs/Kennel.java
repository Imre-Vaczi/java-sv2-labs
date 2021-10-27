package references.dogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dog = new ArrayList(Arrays.asList());

        dog.add(new Dog("Frakk",3,"barna"));
        dog.add(new Dog("Jürgen", 6,"tarka"));
        dog.add(new Dog("Plútó", 10, "világos"));

        System.out.println(dog.toString());
        dog.add(dog.get(1));
        System.out.println(dog.toString());
        Dog nextDog = new Dog("Boci", 13, "fekete");
        System.out.println(nextDog.toString());
        nextDog = dog.get(1);
        System.out.println(nextDog.toString());
        dog.add(nextDog);
        System.out.println(dog.toString());
        // értem mi történik, csak 10+ óra munka után túl hosszú nekem ez a feladat. Nagyon tanulságos, világos, hogy mizu.

    }
}
