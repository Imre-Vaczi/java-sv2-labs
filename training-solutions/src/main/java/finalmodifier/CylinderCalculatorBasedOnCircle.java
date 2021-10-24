package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    double calculateVolume(double r, double h){
        return new CircleCalculator().calculateArea(r) * h;
    }
    double calculateSurfaceArea(double r, double h){
        return new CircleCalculator().calculateArea(r)*2 + new CircleCalculator().calculateArea(r)*h;
    }
}
