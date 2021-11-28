package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position = new Position(0.0, 0.0);

    public Trooper(String name) {
        if ("".equals(name) || name == null) {
            throw new IllegalArgumentException("Name can not be empty or null");
        }
        this.name = name;
    }

    public void changePosition(Position newPosition) {
        if (newPosition == null) {
            throw new IllegalArgumentException("New position can not be null.");
        }
        this.position = newPosition;
    }

    public double distanceFrom(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target position can not be null.");
        }
        return position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
