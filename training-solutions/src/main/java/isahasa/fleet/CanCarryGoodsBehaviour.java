package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;
    private final int maxWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxWeight = cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        if (cargoWeight > this.maxWeight) {
            this.cargoWeight = maxWeight;
            return cargoWeight - maxWeight;
        } else {
            this.cargoWeight = cargoWeight;
            return 0;
        }
    }

    @Override
    public int getCargo() {
        return cargoWeight;
    }
}
