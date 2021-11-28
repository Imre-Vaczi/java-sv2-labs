package immutable;

import org.junit.jupiter.api.Test;

import javax.naming.directory.InvalidAttributesException;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testValidCase() {
        Car car = new Car("Ford", "Model T", 1908);
        assertEquals(1908, car.getYearOfProduction());
    }

    @Test
    void testInvalidYear() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                () ->new Car("Ford", "Model T", 2022));
        assertEquals("Name can not be empty and/or year of production can not be in the future", iae.getMessage());
    }

    @Test
    void testInvalidBrandNull() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                () -> new Car(null, "Model T", 1908));
        assertEquals("Name can not be empty and/or year of production can not be in the future", iae.getMessage());
    }

    @Test
    void testInvalidBrandEmpty() {
        Exception iae = assertThrows(IllegalArgumentException.class,
                ()-> new Car("", "Model T", 1908));
        assertEquals("Name can not be empty and/or year of production can not be in the future", iae.getMessage());
    }

}