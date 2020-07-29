import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double increase = 0;
        int years = 0;
        while (m < k) {
            increase = m * p / 100;
            years++;
            m += increase;
        }
        System.out.println(years);
    }
}