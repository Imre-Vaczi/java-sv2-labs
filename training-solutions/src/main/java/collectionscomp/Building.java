package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private int floors;

    public Building(String address, int area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return floors == building.floors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public int compareTo(Building o) {
        return Integer.valueOf(floors).compareTo(o.floors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                '}';
    }

    public static void main(String[] args) {
        Building house = new Building("ss", 100, 1);
        Building complex = new Building("tt", 160, 2);
        Building tower = new Building("hh", 300, 16);

        Set<Building> buildings = new TreeSet<>();
        buildings.add(house);
        buildings.add(tower);
        buildings.add(complex);

        System.out.println(buildings);

    }
}
