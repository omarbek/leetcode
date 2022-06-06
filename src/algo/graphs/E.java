//package algo.graphs;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int[][] twoD = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                twoD[i][j] = in.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if(twoD[i][j]==1){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
