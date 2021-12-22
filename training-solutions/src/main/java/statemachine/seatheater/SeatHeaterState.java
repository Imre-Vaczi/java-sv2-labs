package statemachine.seatheater;

public enum SeatHeaterState {

    STANDBY {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.HIGH;
        }
    }, HIGH {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.MEDIUM;
        }
    }, MEDIUM {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.LOW;
        }
    }, LOW {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.STANDBY;
        }
    };

    abstract SeatHeaterState next();
}
