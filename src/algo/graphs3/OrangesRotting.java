package algo.graphs3;

public class OrangesRotting {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(new OrangesRotting().orangesRotting(grid));
    }


    public int orangesRotting(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    count = dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length) {
            if (grid[i][j] == 2) {
                dfs(grid, i - 1, j);
                dfs(grid, i + 1, j);
                dfs(grid, i, j - 1);
                dfs(grid, i, j + 1);
            }else if(grid[i][j] == 1){
                grid[i][j]=2;
            }
        }
        return 0;
    }
}
