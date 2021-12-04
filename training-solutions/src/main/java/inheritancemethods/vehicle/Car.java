package inheritancemethods.vehicle;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        if (this.fuel + fuel > tankCapacity) {
            this.fuel = tankCapacity;
        } else {
            this.fuel += fuel;
        }
    }

    public void drive(int km) {
        if (this.fuel - calculateFuelUsed(km) >0) {
            this.fuel -= calculateFuelUsed(km);
        } else {
            this.fuel = 0;
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    public double calculateFuelUsed(int km) {
        return km / fuelRate;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
