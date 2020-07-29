import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String strInUpperCase = str.toUpperCase();

        System.out.println(strInUpperCase.startsWith("J"));
    }
}