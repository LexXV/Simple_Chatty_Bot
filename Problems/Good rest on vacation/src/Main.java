// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int nights = days - 1;
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelNightCost = scanner.nextInt();

        int totalSum = 2 * flightCost + nights * hotelNightCost + days * foodCostPerDay;

        System.out.println(totalSum);
    }
}