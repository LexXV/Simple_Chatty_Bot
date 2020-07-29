import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(string.substring(firstNumber, secondNumber + 1));
    }
}