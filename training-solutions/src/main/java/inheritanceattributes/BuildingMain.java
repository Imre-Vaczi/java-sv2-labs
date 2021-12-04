package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("A", 300.0, 3);
        SchoolBuilding schoolBuilding = new SchoolBuilding("B", 500.0, 3, 10);

        System.out.println(building.getName());
        System.out.println(building.getArea());
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.getName());
        System.out.println(schoolBuilding.getArea());
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
