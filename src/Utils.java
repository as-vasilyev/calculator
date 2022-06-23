import java.util.Scanner;

public class Utils {
    public static int getValue(String order) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s number: \n", order);
        return scanner.nextInt();
    }

    public static void sum(int a, int b) {
        System.out.printf("Multiplication result is: %d", a + b);
    }

    public static void multiply(int a, int b) {
        System.out.printf("Addition result is: %d", a * b);
    }

    public static String operation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the multiplication (*) or addition(+) operation:");
        return scanner.next();
    }
}
