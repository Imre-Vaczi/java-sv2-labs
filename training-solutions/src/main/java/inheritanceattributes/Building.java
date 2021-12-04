package inheritanceattributes;

public class Building {

    protected String name;
    protected double area;
    private int floors;

    public Building(String name, double area, int floors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }
}
