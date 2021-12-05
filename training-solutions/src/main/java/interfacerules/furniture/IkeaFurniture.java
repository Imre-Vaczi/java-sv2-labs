package interfacerules.furniture;

public class IkeaFurniture implements Name, Length, Width{

    private String name;
    private double length;
    private double width;

    public IkeaFurniture(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }
}
