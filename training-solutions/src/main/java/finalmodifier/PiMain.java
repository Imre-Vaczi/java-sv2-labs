package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(new CircleCalculator().calculateArea(10));
        System.out.println(new CircleCalculator().calculatePerimeter(10));
        System.out.println(new CylinderCalculator().calculateSurfaceArea(10,2));
        System.out.println(new CylinderCalculator().calculateVolume(10, 2));
        System.out.println(new CylinderCalculatorBasedOnCircle().calculateVolume(10, 2));
        System.out.println(new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(10,2));
        System.out.println(CircleCalculator.PI);
    }
}
