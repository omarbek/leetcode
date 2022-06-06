//package algo.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        int height = in.nextInt();
        int[][] twoD = new int[height][2];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2; j++) {
                twoD[i][j] = in.nextInt() - 1;
            }
        }
        int[][] arr = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < twoD.length; i++) {
            arr[twoD[i][0]][twoD[i][1]] = 1;
        }
        for (int i = 0; i < twoD.length; i++) {
            arr[twoD[i][1]][twoD[i][0]] = 1;
        }
        for (int i = 0; i < vertices; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < vertices; j++) {
                if (arr[i][j] == 1) {
                    list.add(j + 1);
                }
            }
            System.out.print(list.size() + " ");
            list.forEach(q -> System.out.print(q + " "));
            System.out.println();
        }
    }
}
