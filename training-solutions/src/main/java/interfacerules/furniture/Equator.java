package interfacerules.furniture;

public class Equator implements Name, Length{

    final static String NAME = "Egyenlítő";
    final static double LENGTH = 40075;

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

}
