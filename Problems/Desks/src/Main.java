// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int result = ((firstGroup + firstGroup % 2) / 2 + (secondGroup + secondGroup % 2) / 2 + (thirdGroup + thirdGroup % 2) / 2);

        System.out.println(result);
    }
}