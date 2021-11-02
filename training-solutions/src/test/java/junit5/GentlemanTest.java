package junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void createTest(){
        Gentleman gentleman = new Gentleman();
        String messageToCheck = gentleman.sayHello("John Doe");
        assertEquals("Hello John Doe", messageToCheck);
    }
    @Test
    void createTestAno(){
        Gentleman gentleman = new Gentleman();
        String mesToCheck = gentleman.sayHello(null);
        assertEquals("Hello Anonymus", mesToCheck);
    }

}
