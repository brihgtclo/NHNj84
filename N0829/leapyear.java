package N0829;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        System.out.print("Enter a year : ");
        int day = scanner.nextInt();
        isLeapYear(year);
//        leapYearTest();
        numToDay(day, year);

    }

    private static void numToDay(int day, int year) {
        int[] numToDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] numToDayLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) && day <= 366) {
            for (int i = 0; i < 12; i++) {
                if (day > numToDayLeap[i]) {
                    day -= numToDayLeap[i];
                } else {
                    System.out.println((i + 1) + " 월 " + day + "일");
                    break;
                }
            }
        } else {
            for (int i = 0; i < 12; i++) {
                if (day > numToDay[i]) {
                    day -= numToDay[i];
                } else {
                    System.out.println((i + 1) + " 월 " + day + "일");
                    break;
                }
            }
        }
    }

    private static void leapYearTest() {

        isLeapYear(200);
        isLeapYear(400);
        isLeapYear(104);
        isLeapYear(8);
        isLeapYear(2);

        try {
            isLeapYear(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            isLeapYear(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void isLeapYear(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("양수를 입력해 주세요");
        }
        if (i == 0) {
            throw new IllegalArgumentException("0년은 없습니다");
        }

        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
            System.out.println("윤년입니다");
        } else {
            System.out.println("윤년이 아닙니다");
        }
    }
}
