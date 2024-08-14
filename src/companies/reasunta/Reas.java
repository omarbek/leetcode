package companies.reasunta;

public class Reas {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 3, 1, 5},
                {3, 0, 2, 0, 2},
                {3, 1, 3, 2, 0},
                {2, 4, 2, -1, 0},
                {5, 0, 3, 9, 9}
        };
        System.out.println(maxSum(matrix, 2));
    }

    public static int maxSum(int[][] matrix, int windowSize) {
        int max = Integer.MIN_VALUE;

        //m[0][0]
        //m[0][1]
        //m[1][0]
        //m[1][1]

        //m[0][1]
        //m[0][2]
        //m[1][1]
        //m[1][2]

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                int sum = getSum(matrix, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;

}

    private static int getSum(int[][] matrix, int i, int j) {
        return matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
    }
}
