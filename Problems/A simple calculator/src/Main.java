import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        String operator = scanner.next();
        long b = scanner.nextLong();
        long result;

        switch (operator) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    result = a / b;
                    System.out.println(result);
                }
                break;
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}