// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfSquirrels = scanner.nextInt();
        int noOfNuts = scanner.nextInt();
        System.out.println(noOfNuts % noOfSquirrels);
    }
}