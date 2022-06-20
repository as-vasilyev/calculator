import java.util.Scanner;

public class Runner {
    public static void main(String[] str) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Select the multiplication (*) or addition(+) operation:");
        String operation = scanner.next();
        System.out.print("Enter second number:");
        int secondNumber = scanner.nextInt();
        if (operation.equals("*")) {
            System.out.printf("Multiplication result is: %d", firstNumber * secondNumber);
        }
        else if (operation.equals("+")) {
            System.out.printf("Addition result is: %d", firstNumber + secondNumber);
        }
        else {
            System.out.println("Invalid operation was selected");
        }
    }
}
