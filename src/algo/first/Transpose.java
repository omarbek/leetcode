package algo.first;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        Arrays.stream(new Transpose().transpose(matrix)).forEach(q -> Arrays.stream(q).forEach(System.out::println));
    }

    public int[][] transpose(int[][] matrix) {
        int[][]ret=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                ret[i][j]=matrix[j][i];
            }
        }
        return ret;
    }
}
