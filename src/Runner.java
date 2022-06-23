public class Runner {
    public static void main(String[] str) {
        int firstNumber =  Utils.getValue("first");
        String operation = Utils.operation();
        int secondNumber =  Utils.getValue("second");

        switch (operation) {
            case "*" -> Utils.multiply(firstNumber, secondNumber);
            case "+" -> Utils.sum(firstNumber, secondNumber);
            default -> System.out.println("Invalid operation was selected");
        }
    }
}
