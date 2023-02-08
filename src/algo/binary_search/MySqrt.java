package algo.binary_search;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(9));
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return x;
        }
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if ((mid + 1) > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
    }
}
