package test;

import static java.lang.Math.random;

public class Library {
    private String[] list;
    private int count;

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("도서관의 크기는 1보다 작을 수 없습니다");
        }
        list = new String[size];
        count = 0;

        for (int i = 0; i < size; i++) {
            list[i] = "";
        }
    }


    public void add(String book) {
        if (count == list.length) throw new IllegalArgumentException("책장이 가득");
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) throw new IllegalArgumentException("[" + book + "]은 이미 존재하는 책입니다");
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == "") {
                list[i] = book;
                count++;
                System.out.println("[" + book + "]" + (i + 1) + "번째에 추가되었습니다");
                return;
            }
        }
        System.out.println("자리가 없습니다");
    }


    public void delete(String book) {
        if (count == 0) {
            System.out.println("책이 한권도 없습니다.");
            return;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = "";
                count--;
                return;
            }
        }
        System.out.println("[" + book + "]과" + "일치하는 책이 없습니다");
    }

    public void find(String book) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) {
                System.out.println("[" + book + "]이" + (i + 1) + "번째에 있습니다");
                return;
            }
        }
        System.out.println("[" + book + "]" + "책이 존재하지않습니다");
    }

    public void findAll() {
        System.out.println("==============================");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + "번째 : " + list[i] + " ");
        }
        System.out.println("==============================");
        System.out.println();
    }

    public static class Main {
        public static void main(String[] args) {
            int random1 = (int) (random() * 6) + 1;
            int random2 = (int) (random() * 6) + 1;

            Dice dice1 = new Dice(random1);
            Dice dice2 = new Dice(random2);

            System.out.println("주사위 합 = " + DiceCalculator.addDice(dice2, dice1));

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
                System.out.println(e.getMessage());
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
}
