package conventions;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter persons: ");
        int persons = scanner.nextInt();
        System.out.println("Enter doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter carType: ");
        String carType = scanner.nextLine();
        System.out.println("Enter engineType: ");
        String engineType = scanner.nextLine();

        Car car = new Car(carType, engineType, doors, persons);

        System.out.println("Details");
        System.out.println("Type of the car: " + car.getCarType());
        System.out.println("Type of the engine: " + car.getEngineType());
        System.out.println("Number of seats: " + car.getPersons());
        System.out.println("Number of doors: " + car.getDoors());

        System.out.println("Update the number of seats: ");
        car.setPersons(scanner.nextInt());
        System.out.println("Update number of doors: ");
        car.setDoors(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Update type of the car: ");
        car.setCarType(scanner.nextLine());
        System.out.println("Update the model name: ");
        car.addModelName(scanner.nextLine());
        System.out.println("Update the engine type: ");
        car.setEngineType(scanner.nextLine());

        System.out.println("Details");
        System.out.println("Type of the car: " + car.getCarType());
        System.out.println("Type of the engine: " + car.getEngineType());
        System.out.println("Number of seats: " + car.getPersons());
        System.out.println("Number of doors: " + car.getDoors());
    }
}
