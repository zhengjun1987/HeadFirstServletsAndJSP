package foo;

import java.util.Random;

public class DiceRoller {
    public static int rollDice() {
        return new Random().nextInt(6) + 1;
    }
}
