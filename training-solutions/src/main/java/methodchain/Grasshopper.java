package methodchain;

public class Grasshopper {

    private int position = 0;

    private Grasshopper hopOnce(Direction direction) {
        if (direction.equals(Direction.POSITIVE)) {
            position++;
        }
        else {
            position--;
        }
        return this;
    }

    void moveFromZeroToThreeWithFiveHops() {
        hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
