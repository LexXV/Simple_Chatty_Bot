// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();
        System.out.println(secondHours * 60 * 60 + secondMinutes * 60 + secondSeconds - firstHours * 60 * 60 - firstMinutes * 60 - firstSeconds);
    }
}