package compositionlist.computer;

public class Cpu {
    private String model;
    private double clockSignal;

    public String toString() {
        return "Cpu: " +"\n" + "    model: " + model +"\n" + "    clockSignal: " + clockSignal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }

    public String getModel() {
        return model;
    }

    public double getClockSignal() {
        return clockSignal;
    }

    public Cpu(String model, double clockSignal) {
        this.model = model;
        this.clockSignal = clockSignal;
    }
}
