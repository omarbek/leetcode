//package algo.graphs;

import java.io.IOException;
import java.util.Scanner;

public class B {
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
                if (twoD[i][j] == 1) {
                    if (twoD[j][i] != 1) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
