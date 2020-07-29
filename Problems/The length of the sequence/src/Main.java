import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int count = 0;
        while (value != 0) {
            value = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}