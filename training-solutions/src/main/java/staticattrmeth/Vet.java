package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogs() {
        return List.copyOf(dogs);
    }

    public static long getCode() {
        return code;
    }

    public void addDog(Dog dog) {
        dog.setIdentification(code);
        dogs.add(dog);
        code++;
    }
}
