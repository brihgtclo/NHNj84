package test;

/**
 * 다이스 계산
 */
public class DiceCalculator {
    private DiceCalculator() {
    }

    public static boolean odd(Dice dice) {
        return dice.getNumber() % 2 != 0;
    }

    public static int addDice(Dice dice2, Dice dice1) {
        return dice1.getNumber() + dice2.getNumber();
    }

    public static String getIndexOf(String str, int val) {
        return str.substring(0, val + 1);
    }

}
