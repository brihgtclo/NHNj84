package test;

import static java.lang.Math.random;

import java.util.Random;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int random1 = r.nextInt(6) + 1;
        int random2 = r.nextInt(6) + 1;

        Dice first = new Dice(random1);
        Dice second = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(first, second));

        String str = "abcdefg";

        int val = (int) (random() * str.length());
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = (int) (random() * 6 + 1);
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈이 홀수 :" + DiceCalculator.odd(dice));
        try {
            new Library(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Library(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Library library = new Library(5);

        library.add("책 재목1");
        library.add("책 재목2");
        library.add("책 재목3");
        library.add("책 재목4");
        try {
            library.add("책 재목2");
        } catch (IllegalArgumentException e) {
        }
        library.delete("책 재목2");
        library.delete("책 재목4");
        library.find("책 재목1");
        library.find("책 제목2");
        library.findAll();
    }

    private static class DiceCalculator {


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

    private static class Dice {
        private int number;

        public int getNumber() {
            return number;
        }

        public Dice(int number) {
            this.number = number;
        }
    }
}
