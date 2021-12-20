package interfaceextends.robot;

import methodpass.troopers.Position;

import java.util.List;

public class AstroBoy implements FlyableRobot{

    private Point position;
    private int angle;
    private List<Point> path;
    final static long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
        Point tempPoint = new Point(position.getX(), position.getY(), altitude);
        addToPath(tempPoint);
        moveToPosition(tempPoint);
    }

    public void flyTo(Point position) {
        addToPath(position);
        moveToPosition(position);
    }

    @Override
    public void moveTo(Point position) {
        addToPath(position);
        moveToPosition(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        addToPath(position);
        moveToPosition(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return List.copyOf(path);
    }

    private void addToPath(Point position) {
        path.add(position);
    }

    private void moveToPosition(Point newPosition) {
        this.position = newPosition;
    }
}
