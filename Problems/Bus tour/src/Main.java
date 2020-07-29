import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int busHeight = sc.nextInt();
        int bridgesSum = sc.nextInt();
        int bridgeNumber = 0;
        int crashBridge = 0;

        boolean notCrash = true;

        while (true) {
            int bridgeHeight = sc.nextInt();
            bridgeNumber++;

            if (bridgeHeight <= busHeight) {
                notCrash = false;
                crashBridge = bridgeNumber;
                System.out.println("Will crash on bridge " + crashBridge);
                break;
            }

            if (bridgeNumber == bridgesSum) {
                break;
            }

            if (bridgeHeight > busHeight) {
                notCrash = true;
                continue;
            }

        }

        if (notCrash) {
            System.out.println("Will not crash");
        }
    }
}