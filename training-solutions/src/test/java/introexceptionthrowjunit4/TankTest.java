package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

class TankTest {
    @Test
    public void testWithOKValue() {
        Tank tank = new Tank();
        tank.modifyAngle(70);
        assertEquals(70, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidDataA() {
        Tank tank = new Tank();
        tank.modifyAngle(90);
    }

    @Test
    public void testWithInvalidDataB() {
        IllegalArgumentException exception = assertThrow(IllegalArgumentException.class,
                () -> new Tank().modifyAngle(10));
        assertEquals("A pozíció érvénytelen tartományba esik!",exception.getMessage());
    }

    @Rule
    public ExpectedException exception ExpectedExceptions.none();

    @Test
    public void testWithInvalidDataC() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("A pozíció érvénytelen tartományba esik!");
        Tank tank = new Tank();
        tank.modifyAngle(90);
    }
}