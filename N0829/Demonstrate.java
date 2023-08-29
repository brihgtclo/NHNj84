package N0829;

import java.util.Scanner;

public class Demonstrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int i = scanner.nextInt();

        double f = 5.0 * (i-32.0) / 9.0;

        System.out.println(f);
        scanner.close();
    }
}
