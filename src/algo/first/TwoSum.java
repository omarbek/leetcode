package algo.first;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        Arrays.stream(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
        Arrays.stream(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[]{0, 1};
        }
        return getSum(0, nums, target);
    }

    private int[] getSum(int index, int[] nums, int target) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == target - nums[index]) {
                return new int[]{index, i};
            }
        }
        return getSum(index + 1, nums, target);
    }
}
