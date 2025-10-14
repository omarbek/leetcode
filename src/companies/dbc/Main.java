package companies.dbc;

import java.util.Scanner;

public class Main {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int diff;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            diff = prices[i] - min;
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }

    public static void main(String[] args) {
// Read input values from stdin
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

// Call maxProfit and display the result
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
