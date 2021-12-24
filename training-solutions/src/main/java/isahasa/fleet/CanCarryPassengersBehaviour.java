package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passenger;
    private final int maxPassenger;

    public CanCarryPassengersBehaviour(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public int loadPassenger(int passengerWeight) {
        if (passengerWeight > maxPassenger) {
            this.passenger = maxPassenger;
            return passengerWeight - maxPassenger;
        } else {
            this.passenger = passengerWeight;
            return 0;
        }
    }

    @Override
    public int getPassenger() {
        return passenger;
    }
}
