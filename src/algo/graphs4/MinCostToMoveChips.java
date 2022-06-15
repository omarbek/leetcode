package algo.graphs4;

public class MinCostToMoveChips {
    public static void main(String[] args) {
//        System.out.println(new MinCostToMoveChips().minCostToMoveChips(new int[]{1, 2, 3}));
//        System.out.println(new MinCostToMoveChips().minCostToMoveChips(new int[]{2,2,2,3,3}));
        System.out.println(new MinCostToMoveChips().minCostToMoveChips(new int[]{1,1000000000}));
    }

    public int minCostToMoveChips(int[] position) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < position.length; i++) {
            int count = 0;
            for (int j = 0; j < position.length; j++) {
                if (i != j) {
                    int res = Math.abs(position[i] - position[j]) % 2;
                    count += res;
                }
            }
            if (count < min) {
                min = count;
            }
        }
        return min;
    }
}
