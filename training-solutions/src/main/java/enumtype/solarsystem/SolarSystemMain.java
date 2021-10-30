package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for (SolarSystem i: SolarSystem.values()){
            System.out.println("The number of moons of " + i + ": "+i.getValue());
        }
    }
}
