package methodpass.troopers;

public class Position {
    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position can not be null");
        }
        double xx = (posX - position.getPosX()) * (posX - position.getPosX());
        double yy = (posY - position.getPosY()) * (posY - position.getPosY());
        return Math.sqrt(xx + yy);
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
