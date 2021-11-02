package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName(){
        Dragon dragon = new Dragon("Süsü", 1,2);
        String textName = dragon.getName();
        assertEquals("Süsü", textName);
        assertNotEquals("süsü", textName);
    }
    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Süsü", 1,2);
        assertEquals(1,dragon.getNumberOfHeads());
        assertTrue(1 == dragon.getNumberOfHeads());
        assertFalse(0 > dragon.getNumberOfHeads());

    }
    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1,2.02);
        assertEquals(2.020000004, dragon.getHeight(), 0.00005);
    }
    @Test
    void testNull(){
        Dragon dragon = new Dragon("Süsü", 1,2.02);
        Dragon anotherdDagon = null;
        assertNull(anotherdDagon);
        assertNotNull(dragon);
    }
    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1,2.02);
        Dragon anoterDragon = dragon;
        assertSame(dragon,anoterDragon);
    }
    @Test
    void testNotSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1,2.02);
        Dragon anoterDragon = new Dragon("Süsü", 1,2.02);
        //assertSame(dragon, anoterDragon);
        assertNotSame(dragon, anoterDragon);
    }


}
