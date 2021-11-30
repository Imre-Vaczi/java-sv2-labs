package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void testAddDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("a", 10, Species.MIXTURE));
        vet.addDog(new Dog("b", 11, Species.MIXTURE));
        assertEquals(1, vet.getDogs().get(0).getIdentification());
        assertEquals(2, vet.getDogs().get(1).getIdentification());
        assertEquals(2, vet.getDogs().size());

    }

}