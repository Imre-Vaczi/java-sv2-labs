package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{

    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = 100;
    }

    private void shootingAnArrow(Character enemy) {
        this.numberOfArrow -= 1;
        hit(enemy, getActualSecondaryDamage());
    }

    protected int getActualSecondaryDamage() {
        return getRandom().nextInt(1, 6);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
