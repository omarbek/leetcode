package algo.graphs4;

public class CountBattleships {
    public static void main(String[] args) {
        System.out.println(new CountBattleships().countBattleships(
                new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
    }

    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean dfs(char[][] board, int i, int j) {
        if (i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'X') {
            board[i][j] = '.';
            dfs(board, i - 1, j);
            dfs(board, i + 1, j);
            dfs(board, i, j + 1);
            dfs(board, i, j - 1);
            return true;
        }
        return false;
    }
}
