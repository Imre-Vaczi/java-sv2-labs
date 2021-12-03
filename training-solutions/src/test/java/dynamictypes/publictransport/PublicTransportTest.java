package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testGenerating() {
        PublicVehicle bus = new Bus(10,20,"Ikarus");
        PublicVehicle tram = new Tram(4,30,3);
        PublicVehicle metro = new Metro(2,50,5);
        PublicTransport publicTransport = new PublicTransport(Arrays.asList(bus, tram, metro));

        assertEquals(3, publicTransport.getPublicVehicleList().size());
    }

}