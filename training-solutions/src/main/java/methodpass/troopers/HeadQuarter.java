package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public HeadQuarter(List<Trooper> troopers) {
        this.troopers = troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper can not be null.");
        }
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target can not be null.");
        }
        moveTrooper(findClosestTrooper(target), target);
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper closest = troopers.get(0);
        for (Trooper trooper : troopers) {
            if (closest.distanceFrom(target) > trooper.distanceFrom(target)) {
                closest = trooper;
            }
        }
        return closest;
    }

    private Trooper findTrooperByName(String name) {
        if ("".equals(name) || name.isEmpty()) {
            throw new IllegalArgumentException("Search term can not be empty or null.");
        }
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        return null;
    }
}
