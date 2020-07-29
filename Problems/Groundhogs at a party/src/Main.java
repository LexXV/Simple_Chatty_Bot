import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peanutCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean successNonWeekend = peanutCups >= 10 && peanutCups <= 20 && !isWeekend;
        boolean successWeekend = peanutCups >= 15 && peanutCups <= 25 && isWeekend;

        System.out.println(successNonWeekend || successWeekend);
    }
}