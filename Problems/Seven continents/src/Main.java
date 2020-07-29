// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Africa = scanner.next();
        String Antarctica = scanner.next();
        String Asia = scanner.next();
        String Australia = scanner.next();
        String Europe = scanner.next();
        scanner.nextLine();
        String NorthAmerica = scanner.nextLine();
        String SouthAmerica = scanner.nextLine();

        System.out.println(Asia);
        System.out.println(Africa);
        System.out.println(NorthAmerica);
        System.out.println(SouthAmerica);
        System.out.println(Antarctica);
        System.out.println(Europe);
        System.out.println(Australia);
    }
}