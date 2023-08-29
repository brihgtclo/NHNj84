package N0829;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int i = scanner.nextInt();
        if(i%4==0){
            System.out.println("윤년입니다");
        }
        else {
            System.out.println("윤년이 아닙니다");
        }
    }
}
