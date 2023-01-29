package problems;

import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args) {
        System.out.println(new KthSmallest().kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    }

//    public int kthSmallest(int[][] matrix, int k) {
//        List<Integer> list = new ArrayList<>();
//        for (int[] ints : matrix) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                list.add(ints[j]);
//            }
//        }
//        Collections.sort(list);
//        return list.get(k - 1);
//    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> Integer.compare(o2, o1)));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                queue.offer(matrix[i][j]);
                if (queue.size() > k) {
                    queue.poll();
                }
                System.out.println();
            }
        }
        return queue.poll();
    }
}
