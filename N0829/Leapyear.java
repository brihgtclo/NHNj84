package N0829;

import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        System.out.print("Enter a day : ");
        int day = scanner.nextInt();
        isLeapYear(year);
//        leapYearTest();
        numToDay(day, year);
        ifNumToDay(day);

    }

    private static void ifNumToDay(int day) {
        int month = 1;
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 28) {
            month++;
            day -= 28;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 30) {
            month++;
            day -= 30;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 30) {
            month++;
            day -= 30;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 30) {
            month++;
            day -= 30;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month++;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 30) {
            month++;
            day -= 30;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }
        if (day > 31) {
            month = 12;
            day -= 31;
        } else {
            System.out.println(month + "월" + day + "일");
            return;
        }

    }

    private static void numToDay(int day, int year) {
        int[] numToDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] numToDayLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYearBooean(day, year)) {
            leapYearDay(day, numToDayLeap);
        } else {
            Day(day, numToDay);
        }
    }

    private static void Day(int day, int[] numToDay) {
        for (int i = 0; i < 12; i++) {
            if (day > numToDay[i]) {
                day -= numToDay[i];
            } else {
                System.out.println((i + 1) + " 월 " + day + "일");
                break;
            }
        }
    }

    private static void leapYearDay(int day, int[] numToDayLeap) {
        for (int i = 0; i < 12; i++) {
            if (day > numToDayLeap[i]) {
                day -= numToDayLeap[i];
            } else {
                System.out.println((i + 1) + " 월 " + day + "일");

                break;
            }
        }
    }

    private static boolean isLeapYearBooean(int day, int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) && day <= 366;
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
