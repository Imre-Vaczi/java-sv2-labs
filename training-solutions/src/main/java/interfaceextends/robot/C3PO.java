package interfaceextends.robot;

import methodpass.troopers.Position;

import java.util.List;

public class C3PO implements MovableRobot {

    private Point position;
    private int angle;
    private List<Point> path;

    public C3PO(Point position) {
        this.position = position;
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

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public List<Point> getPath() {
        return path;
    }

    private void addToPath(Point position) {
        path.add(position);
    }

    private void moveToPosition(Point newPosition) {
        this.position = newPosition;
    }
}
