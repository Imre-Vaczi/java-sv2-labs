package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {
    @Test

    void checkMyMethod(){
        WithoutAccents withoutAccents = new WithoutAccents();
        assertEquals('e', withoutAccents.returnEnglishChar('é'));
        assertEquals('u', withoutAccents.returnEnglishChar('ü'));
        assertEquals('u', withoutAccents.returnEnglishChar('ű'));
        assertEquals('u', withoutAccents.returnEnglishChar('ú'));
        assertEquals('a', withoutAccents.returnEnglishChar('á'));
    }

}