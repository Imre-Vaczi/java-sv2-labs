package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    private Car car;
    public static final int MAX_CARRY_WEIGHT = 2000;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + getVehicleWeight();
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
