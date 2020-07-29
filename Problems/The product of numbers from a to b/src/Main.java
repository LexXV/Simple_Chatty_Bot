import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long productOfNumbers = 1L;

        for (int i = a; i < b; i++) {
            productOfNumbers *= i;
            }

        System.out.println(productOfNumbers);
    }
}