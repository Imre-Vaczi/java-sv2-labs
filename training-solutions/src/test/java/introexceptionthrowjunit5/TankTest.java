package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import javax.naming.directory.InvalidAttributesException;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    void testTankWithValidData(){
        tank.modifyAngle(75);
        assertEquals(75, tank.getAngle());
    }

    @Test
    void testTankWithInvalidData(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> tank.modifyAngle(100));
        assertEquals("A pozíció érvénytelen tartományba esik.", exception.getMessage());
    }
}