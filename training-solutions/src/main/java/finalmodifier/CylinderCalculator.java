package finalmodifier;

public class CylinderCalculator {
    double calculateVolume(double r, double h){
        return r * r * CircleCalculator.PI * h;
    }
    double calculateSurfaceArea(double r, double h){
        return (h * CircleCalculator.PI * 2 * r) + (r*r*CircleCalculator.PI*2);
    }
}
