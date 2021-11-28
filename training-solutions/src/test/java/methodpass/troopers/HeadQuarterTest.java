package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    @Test
    void testAddTrooper() {
        HeadQuarter headQuarter = new HeadQuarter();
        Trooper trooper = new Trooper("AA");

        headQuarter.addTrooper(trooper);

        assertEquals(1, headQuarter.getTroopers().size());
        assertEquals("AA", headQuarter.getTroopers().get(0).getName());
    }

    @Test
    void testMoveTrooperByName() {
        HeadQuarter headQuarter = new HeadQuarter();
        Trooper ab = new Trooper("AB");
        headQuarter.addTrooper(ab);
        headQuarter.moveTrooperByName("AB", new Position(2, 2));

        assertEquals(2, ab.getPosition().getPosX(), 0.000001);
        assertEquals(2, ab.getPosition().getPosY(), 0.000001);
    }

    @Test
    void testMoveClosestTrooper() {
        HeadQuarter headQuarter = new HeadQuarter();
        Trooper a = new Trooper("AA");
        a.changePosition(new Position(8, 2));
        headQuarter.addTrooper(a);
        Position target = new Position(10, -4);
        headQuarter.moveClosestTrooper(target);

        assertEquals(10, a.getPosition().getPosX(), 0.000001);
        assertEquals(-4, a.getPosition().getPosY(), 0.000001);
    }
}