//package algo.graphs;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int[][] twoD = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                twoD[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (twoD[i][j] == 1) {
                    if (j > i) {
                        System.out.println((i + 1) + " " + (j + 1));
                    }
                }
            }
        }
    }
}
