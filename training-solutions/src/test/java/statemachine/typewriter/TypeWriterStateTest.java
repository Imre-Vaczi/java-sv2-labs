package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testOffToOn() {
        assertEquals(TypeWriterState.CAPS_LOCK_OFF, TypeWriterState.CAPS_LOCK_ON.changeTo());
    }

    @Test
    void testOnToOff() {
        assertEquals(TypeWriterState.CAPS_LOCK_ON, TypeWriterState.CAPS_LOCK_OFF.changeTo());
    }
}