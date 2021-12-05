package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        Area rectangle = new Rectangle(2,2);
        assertEquals(4, rectangle.getArea());
    }
}