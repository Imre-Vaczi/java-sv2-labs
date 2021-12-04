package inheritancemethods.vehicle;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        if (super.getFuel() + fuel > super.getTankCapacity() + extraCapacity) {
            this.fuel = tankCapacity;
        } else {
            this.fuel += fuel;
        }
    }


}
