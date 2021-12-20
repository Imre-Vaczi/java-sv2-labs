package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testFamilyCar() {
        FamilyCar familyCar = new FamilyCar();
        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void testSportCar() {
        SportsCar sportsCar = new SportsCar();
        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void testCar() {
        Car car = new Car("Tata", 8);
        assertEquals(8, car.getNumberOfSeats());
    }

}