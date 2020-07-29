import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int divisor = 2;
        while (divisor < number) {
            if (number % divisor == 0) {
                return true;
            }
            divisor++;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}