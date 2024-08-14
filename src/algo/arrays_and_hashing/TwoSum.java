package algo.arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        Arrays.stream(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
        Arrays.stream(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[]{map.get(j), i};
            }
            map.put(nums[i], i);
        }
        return ret;
    }
}
