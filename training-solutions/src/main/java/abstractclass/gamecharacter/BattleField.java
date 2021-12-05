package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        attacker.primaryAttack(defender);
            if (defender.isAlive()) {
                defender.secondaryAttack(attacker);
            }
        return attacker.isAlive() && defender.isAlive();
    }

    public Character fight(Character one, Character other) {
        for (int i = 0; ; i++) {
            round++;
            if (i % 2 == 0) {
                if (!oneHit(one, other)) {
                    if (one.isAlive()) {
                        return other;
                    } else {
                        return one;
                    }
                }
            } else {
                if (!oneHit(other, one)){
                    if (one.isAlive()) {
                        return other;
                    } else {
                        return one;
                    }
                }
            }
        }
    }
}
