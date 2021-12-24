package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers{

    private final CanCarryPassengers canCarryPassengers;
    private final CanCarryGoods canCarryGoods;

    public FerryBoat(int maxCargoWeight, int maxPassengerWeight) {
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
        this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengerWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargo() {
        return canCarryGoods.getCargo();
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
