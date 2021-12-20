package interfacedefaultmethods.cloth;

public interface Square {

    default double getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        double a = getSide();
        return Math.sqrt((a*a) + (a*a));
    }

    default double getPerimeter() {
        double a = getSide();
        return a *4;
    }

    default double getArea() {
        double a = getSide();
        return a * a;
    }

    abstract double getSide();

}
