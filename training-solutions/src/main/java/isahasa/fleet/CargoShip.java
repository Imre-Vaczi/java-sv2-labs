package isahasa.fleet;

public class CargoShip implements CanCarryGoods, Ship{

    private final CanCarryGoods canCarryGoods;

    public CargoShip(int maxCargoWeight) {
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargo() {
        return canCarryGoods.getCargo();
    }
}
