import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maximum = 0;
        int counter = 1;

        while (counter <= n) {
            int number = scanner.nextInt();

            if (number % 4 == 0 && number > maximum) {
                maximum = number;
            }
            counter++;
        }
        System.out.println(maximum);
    }
}