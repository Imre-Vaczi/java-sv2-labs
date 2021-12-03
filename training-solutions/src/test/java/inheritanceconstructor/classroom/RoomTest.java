package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testGenerating() {
        Room room = new Room("a", 20);

        assertEquals("a", room.getLocation());
        assertEquals(20, room.getCapacity());
    }
}