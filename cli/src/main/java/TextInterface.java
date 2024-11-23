import java.util.Scanner;

public class TextInterface {
    private static int firstNumber;
    private static int secondNumber;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean programRuns = true;

        while (programRuns) {
            acceptTwoNumbersInput(scanner);

            printMenu();

            int result = 0;
            switch(scanner.next()) {
                case "+":
                    result = calculator.add(firstNumber, secondNumber);
                    break;
                case "-":
                    result = calculator.subtract(firstNumber, secondNumber);
                    break;
                case "*":
                    result = calculator.multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    result = calculator.divide(firstNumber, secondNumber);
                    break;
                case "exit":
                    programRuns = false;
            }

            System.out.println("Результат: " + result);

        }
    }
    private static void printMenu() {
        System.out.println("""
                Выберите арифметическую операцию:
                + - сумма
                - - разница
                * - умножение
                / - деление""");
    }

    public static void acceptTwoNumbersInput(Scanner scanner) {
        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextInt();
    }
}
