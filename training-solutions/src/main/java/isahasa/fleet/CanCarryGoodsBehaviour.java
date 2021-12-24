package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;
    private final int maxWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxWeight = cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int remainder = 0;
        if (cargoWeight <= maxWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            remainder = cargoWeight - maxWeight;
            this.cargoWeight = maxWeight;
        }
        return remainder;
    }

    @Override
    public int getCargo() {
        return cargoWeight;
    }
}
