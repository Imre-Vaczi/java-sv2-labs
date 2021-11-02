package junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void testTheClass(){
        Gentleman gentleman = new Gentleman();
        String textForChecking = gentleman.sayHello("John Doe");
        assertEquals("Hello John Doe", textForChecking);
    }
}
