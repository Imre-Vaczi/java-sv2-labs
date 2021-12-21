package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testForBikes() {
        Vehicle vehicle = Vehicle.of(2);
        assertEquals(2, ((Bicycle)vehicle).getNumberOfWheels());
        assertEquals(Bicycle.class, vehicle.getClass());
    }

    @Test
    void testForBikesInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> Vehicle.of(1));
        assertEquals("Valid values for the number of wheels should be 2 or 4.", exception.getMessage());
    }

    @Test
    void testForCars() {
        Vehicle vehicle = Vehicle.of(4);
        assertEquals(4, ((Car)vehicle).getNumberOfWheels());
        assertEquals(Car.class, vehicle.getClass());
    }

    @Test
    void testForCarsInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> Vehicle.of(5));
        assertEquals("Valid values for the number of wheels should be 2 or 4.", exception.getMessage());
    }
}