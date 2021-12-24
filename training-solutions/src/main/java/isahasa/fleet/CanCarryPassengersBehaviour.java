package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passenger;
    private final int maxPassenger;

    public CanCarryPassengersBehaviour(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public int loadPassenger(int passengerWeight) {
        int remainder = 0;

        if (passenger <= maxPassenger) {
            this.passenger = passenger;
        } else {
            remainder = passenger - maxPassenger;
            this.passenger = maxPassenger;
        }
        return remainder;
    }

    @Override
    public int getPassenger() {
        return passenger;
    }
}
