package algo.dp;

import java.util.*;

public class CanPartition {

    public static void main(String[] args) {
        System.out.println(new CanPartition().canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(new CanPartition().canPartition(new int[]{1, 2, 3, 5}));
//        System.out.println(new CanPartition().canPartition(new int[]{1,2,5}));
//        System.out.println(new CanPartition().canPartition(new int[]{1,5,2,4}));
//        System.out.println(new CanPartition().canPartition(new int[]{1, 4, 4, 7}));
    }

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        Set<Integer> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.isEmpty()) {
                set.add(0);
                set.add(nums[i]);
            } else {
                for (Integer j : temp) {
                    set.add(j + nums[i]);
                }
            }
            temp = new ArrayList<>(set);
        }
        return set.contains(target);
    }
}
