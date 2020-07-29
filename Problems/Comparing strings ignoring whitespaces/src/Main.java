import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String first = in.nextLine();
            String second = in.nextLine();

            first = first.replaceAll(" ", "");
            second = second.replaceAll(" ", "");

            System.out.println(first.equals(second));
        }
    }
}