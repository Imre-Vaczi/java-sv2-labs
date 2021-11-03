package controlselection.greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void testSayHello(){
        Greetings greetings = new Greetings();
        assertEquals("Jó reggelt!", greetings.sayHello(7,0));
        assertEquals("Jó napot!", greetings.sayHello(13,0));
        assertEquals("Jó estét!", greetings.sayHello(19,0));
        assertEquals("Jó éjt!", greetings.sayHello(23,0));
    }

}