package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testArea() {
        Area triangle = new Triangle(2, 2);
        assertEquals(2, triangle.getArea());
    }

}