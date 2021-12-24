package isahasa.fleet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {

    Fleet fleet = new Fleet();

    Liner liner1 = new Liner(100);

    Liner liner2 = new Liner(200);

    CargoShip cargoShip = new CargoShip(50);

    FerryBoat ferryBoat = new FerryBoat(100, 40);

    @BeforeEach
    void init() {
        fleet.addShip(liner1);
        fleet.addShip(liner2);
        fleet.addShip(cargoShip);
        fleet.addShip(ferryBoat);
    }

    @Test
    void testLoadWithoutRemainders() {
        // When
        fleet.loadShip(320, 80);
        // Then
        assertEquals(100, liner1.getPassenger());
        assertEquals(200, liner2.getPassenger());
        assertEquals(20, ferryBoat.getPassenger());
        assertEquals(0, fleet.getWaitingPeople());
        assertEquals(50, cargoShip.getCargo());
        assertEquals(30, ferryBoat.getCargo());
        assertEquals(0, fleet.getWaitingCargo());
    }

    @Test
    void testLoadWithRemainders() {
        // When
        fleet.loadShip(350, 170);
        // Then
        assertEquals(100, liner1.getPassenger());
        assertEquals(200, liner2.getPassenger());
        assertEquals(40, ferryBoat.getPassenger());
        assertEquals(10, fleet.getWaitingPeople());
        assertEquals(50, cargoShip.getCargo());
        assertEquals(100, ferryBoat.getCargo());
        assertEquals(20, fleet.getWaitingCargo());
    }

}