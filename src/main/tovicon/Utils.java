package tovicon;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void waitForInput(Scanner scanner) {
        System.out.print("Appuyez sur Entrée pour continuer ...");
        scanner.nextLine();
    }

    public static int random(int min, int max) {
        Random r = new Random();
        int low = min;
        int high = max;
        return r.nextInt(high - low) + low;
    }
}
