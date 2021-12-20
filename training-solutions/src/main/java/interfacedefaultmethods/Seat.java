package interfacedefaultmethods;

public interface Seat {

    default int getNumberOfSeats() {
        return 5;
    }

}
