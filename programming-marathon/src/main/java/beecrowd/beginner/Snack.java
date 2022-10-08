package beecrowd.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snack {

    private static Map<Integer, Double> tableOfPrice = new HashMap<>();

    public static void main(String[] args) {
        tableOfPrice.put(1, 4.00);
        tableOfPrice.put(2, 4.50);
        tableOfPrice.put(3, 5.00);
        tableOfPrice.put(4, 2.00);
        tableOfPrice.put(5, 1.50);

        Scanner scanner = new Scanner(System.in);
        var X = scanner.nextInt();
        var Y = scanner.nextInt();

        var total = tableOfPrice.get(X) * Y;
        System.out.println("Total: R$ " + total + "0");
    }
}
