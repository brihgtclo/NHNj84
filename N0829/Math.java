package N0829;

public class Math {
    int b = 5;

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int min(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("분모가 0이 될 수 없습니다.");
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int zero = 0;

        System.out.println(sum(a, b));
        System.out.println(mul(a, b));
        System.out.println(min(a, b));
        System.out.println(div(a, zero));
    }
}
