//package algo.graphs;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ton = in.nextInt();
        int inter = in.nextInt();
        int[][] inp = new int[inter][2];
        for (int i = 0; i < inter; i++) {
            for (int j = 0; j < 2; j++) {
                inp[i][j] = in.nextInt() - 1;
            }
        }
        int[][] arr = new int[ton][ton];
        for (int i = 0; i < ton; i++) {
            for (int j = 0; j < ton; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < inp.length; i++) {
            arr[inp[i][0]][inp[i][1]] = 1;
        }
        for (int i = 0; i < inp.length; i++) {
            arr[inp[i][1]][inp[i][0]] = 1;
        }
        for (int i = 0; i < ton; i++) {
            int count = 0;
            for (int j = 0; j < ton; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
