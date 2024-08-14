package algo.dp;

public class MaxAlternatingSum {
    public static void main(String[] args) {
        System.out.println(new MaxAlternatingSum().maxAlternatingSum(new int[]{4, 2, 5, 3}));
    }

    public long maxAlternatingSum(int[] nums) {
        long sumEven = 0;
        long sumOdd = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            long tempEven = Math.max(sumOdd + nums[i], sumEven);
            long tempOdd = Math.max(sumEven - nums[i], sumOdd);
            sumEven = tempEven;
            sumOdd = tempOdd;
        }
        return sumEven;
    }
}
