package companies.delivery;

/**
 * @author omarbekdinasil
 * on 21.04.2022
 * @project leetcode
 */
public class Fourch {
    public static void main(String[] args) {
        System.out.println(new Fourch().solution(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println(new Fourch().solution(new int[]{1, 2, 3, 10, 11, 15}));
        System.out.println(new Fourch().solution(new int[]{5, 4, 2, 1}));
        System.out.println(new Fourch().solution(new int[]{3, 5, 7, 10, 15}));
    }

    public int solution(int[] A) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int diff;
        for (int i = 1; i < A.length; i++) {
            diff = A[i] - A[i - 1];
            if (Math.abs(diff) == 1) {
                if (count == 0) {
                    count = 2;
                } else {
                    count++;
                }
            } else {
                if (count > max) {
                    max = count;
                }
                if (Math.abs(diff) == 1) {
                    count = 2;
                } else {
                    count = 1;
                }
            }
            if (i == A.length - 1) {
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
