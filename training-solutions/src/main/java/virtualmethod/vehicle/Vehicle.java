package virtualmethod.vehicle;

public class Vehicle {

    private int vehicleWeight;
    static final int PERSON_AVERAGE_WEIGHT = 75;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }

    public int getGrossLoad() {
        return getVehicleWeight() + PERSON_AVERAGE_WEIGHT;
    }
}
