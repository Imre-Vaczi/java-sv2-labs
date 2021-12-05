package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testArea() {
        Area circle = new Circle(2.0);
        assertEquals(12.56637, 0.0005 ,circle.getArea());
    }
}