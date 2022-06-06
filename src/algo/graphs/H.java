//package algo.graphs;

import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int[] row : arr) {
            Arrays.fill(row, 0);
        }
        for (int i = 0; i < n; i++) {
            int len = in.nextInt();
            for (int j = 0; j < len; j++) {
                int el = in.nextInt();
                arr[i][el - 1] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
