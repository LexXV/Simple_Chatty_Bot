// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int firstDigit = n / 100;
        int secondDigit = (n % 100) / 10;
        int thirdDigit = n % 10;

        System.out.print(thirdDigit);
        System.out.print(secondDigit);
        System.out.print(firstDigit);
    }
}