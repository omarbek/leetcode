package algo.graphs;

import java.io.IOException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException {
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
                if (i == j && twoD[i][j] == 1) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
