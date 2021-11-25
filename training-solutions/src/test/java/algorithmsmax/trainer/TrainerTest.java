package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testTrainerGenerating() {
        Trainer trainer = new Trainer("XY", 78);

        assertEquals(78, trainer.getAge());
        assertEquals("XY", trainer.getName());
    }
}