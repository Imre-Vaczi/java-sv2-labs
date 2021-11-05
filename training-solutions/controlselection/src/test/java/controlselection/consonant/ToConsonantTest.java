package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void invokeTestResult(){
        ToConsonant toConsonant = new ToConsonant();
        assertEquals('e', toConsonant.inspectCharacter('a'));
        assertEquals('a', toConsonant.inspectCharacter('u'));
    }

}