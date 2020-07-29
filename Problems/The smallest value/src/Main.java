import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int n = 1;
        long factorial = 1L;

        while (factorial <= m) {
            n++;
            factorial *= n;
        }
        System.out.println(n);
    }
}