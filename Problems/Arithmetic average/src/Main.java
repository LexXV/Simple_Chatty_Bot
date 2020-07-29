import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double divNumbers = 0;
        int totalNumbers = 0;

        for (int i = a; i < b + 1; i++) {

            if (i % 3 == 0) {
                divNumbers += i;
                totalNumbers++;
            }
        }

        System.out.println(divNumbers / totalNumbers);
    }
}