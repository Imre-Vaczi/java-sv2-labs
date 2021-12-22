package statemachine.typewriter;

public enum TypeWriterState {

    CAPS_LOCK_ON {
        @Override
        TypeWriterState changeTo() {
            return TypeWriterState.CAPS_LOCK_OFF;
        }
    }, CAPS_LOCK_OFF {
        @Override
        TypeWriterState changeTo() {
            return TypeWriterState.CAPS_LOCK_ON;
        }
    };

    abstract TypeWriterState changeTo();

}
