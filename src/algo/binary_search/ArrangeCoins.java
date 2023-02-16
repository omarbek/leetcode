package algo.binary_search;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(5));
    }

    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        while (left <= right) {
            long k = left + (right - left) / 2;
            long curr = k * (k + 1) / 2;
            if (n == curr) {
                return (int) k;
            }
            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int) right;
    }
}
