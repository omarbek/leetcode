package algo.binary_search;

public class IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println(new IsPerfectSquare().isPerfectSquare(15));
    }

    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = (right + left) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid < num) {
                left = mid + 1;
            } else if (mid * mid > num) {
                right = mid - 1;
            }
        }
        return false;
    }
}
