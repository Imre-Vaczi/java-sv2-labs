package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    Pendrives pendrives;

    @Test
    void testGetBest() {
        List<Pendrive> listOfDrives = new ArrayList<>();
        listOfDrives.add(new Pendrive("a", 2, 1000));
        listOfDrives.add(new Pendrive("b", 3, 1400));
        listOfDrives.add(new Pendrive("c", 4, 3200));
        listOfDrives.add(new Pendrive("d", 1, 800));
        Pendrives pendrives = new Pendrives();
        Pendrive pd = pendrives.getBest(listOfDrives);
        assertEquals("b", pd.getName());
    }

    @Test
    void testGetCheapest() {
        List<Pendrive> listOfDrives = new ArrayList<>();
        listOfDrives.add(new Pendrive("a", 2, 1000));
        listOfDrives.add(new Pendrive("b", 3, 1400));
        listOfDrives.add(new Pendrive("c", 4, 3200));
        listOfDrives.add(new Pendrive("d", 1, 800));
        Pendrives pendrives = new Pendrives();
        Pendrive pd = pendrives.getCheapest(listOfDrives);
        assertEquals("d", pd.getName());
    }

    @Test
    void risePriceWhereCapacity() {
        List<Pendrive> listOfDrives = new ArrayList<>();
        listOfDrives.add(new Pendrive("a", 2, 1000));
        listOfDrives.add(new Pendrive("b", 3, 1400));
        listOfDrives.add(new Pendrive("c", 4, 3200));
        listOfDrives.add(new Pendrive("d", 1, 800));
        Pendrives pendrives = new Pendrives();
        pendrives.risePriceWhereCapacity(listOfDrives, 10,2);
        assertEquals(1100, listOfDrives.get(0).getPrice());
    }
}