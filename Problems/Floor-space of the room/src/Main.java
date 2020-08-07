import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double p;
        double r;
        double floorage;

        String value = scanner.nextLine();
        switch (value) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a + b + c) / 2;
                floorage = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(floorage);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                floorage = a * b;
                System.out.println(floorage);
                break;
            case "circle":
                r = scanner.nextDouble();
                floorage = 3.14 * r * r;
                System.out.println(floorage);
                break;
        }
    }
}