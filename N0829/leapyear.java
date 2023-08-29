package N0829;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int i = scanner.nextInt();
        isLeapYear(i);
//        leapYearTest();

    }

    private static void leapYearTest() {
        isLeapYear(200);
        isLeapYear(400);
        isLeapYear(104);
        isLeapYear(8);
        isLeapYear(2);

        try{
        isLeapYear(-1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
        isLeapYear(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void isLeapYear(int i) {
        if(i<0){
            throw new IllegalArgumentException("양수를 입력해 주세요");
        }
        if(i ==0){
            throw new IllegalArgumentException("0년은 없습니다");
        }

        if((i %4==0&&(i %100!=0)|| i %400==0)){
            System.out.println("윤년입니다");
        }
        else {
            System.out.println("윤년이 아닙니다");
        }
    }
}
