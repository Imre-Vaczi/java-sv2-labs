package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers{

    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassenger) {
        this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassenger);
    }

    @Override
    public int loadPassenger(int passengerWeight) {
        return canCarryPassengers.loadPassenger(passengerWeight);
    }

    @Override
    public int getPassenger() {
        return canCarryPassengers.getPassenger();
    }
}
