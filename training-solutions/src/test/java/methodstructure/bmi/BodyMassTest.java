package methodstructure.bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void createCase() {
        BodyMass bodyMass = new BodyMass(65.4, 1.75);
        assertEquals(65.4, bodyMass.getWeight());
        assertEquals(1.75, bodyMass.getHeight());
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass bodyMass = new BodyMass(65.4, 1.75);
        assertEquals(21.4, 0.05, bodyMass.getBodyMassIndex());
    }

    @Test
    void testBmiCategory() {
        BodyMass bodyMass = new BodyMass(65.4, 1.75);
        assertEquals(BmiCategory.NORMAL, bodyMass.getBody());
    }

    @Test
    void testIsThinnerThan() {
        BodyMass ownBody = new BodyMass(65.4, 1.75);
        BodyMass otherBody = new BodyMass(105.4, 1.55);
        assertTrue(ownBody.isThinnerThan(otherBody));
    }

}