import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int value = 1;
        int square = 1;
        while (value * value <= n) {
            square = value * value;
            value++;
            System.out.println(square);
        }
    }
}