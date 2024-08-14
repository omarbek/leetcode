package algo.arrays_and_hashing;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Arrays.stream(new ProductExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})).forEach(System.out::println);
        Arrays.stream(new ProductExceptSelf().productExceptSelf(new int[]{1,-1, 0, 3, -3})).forEach(System.out::println);
        Arrays.stream(new ProductExceptSelf().productExceptSelf(new int[]{0, 0})).forEach(System.out::println);
        Arrays.stream(new ProductExceptSelf().productExceptSelf(new int[]{0,4, 0})).forEach(System.out::println);
    }

    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        for (int i : nums) {
            if (i == 0) {
                zeroCount++;
            }
        }
        int[] ret = new int[nums.length];
        if (zeroCount > 1) {
            return ret;
        }
        int mult = 1;
        for (int i : nums) {
            if (i != 0) {
                mult *= i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ret[i] = mult;
            } else {
                if (zeroCount == 1) {
                    ret[i] = 0;
                } else {
                    ret[i] = mult / nums[i];
                }
            }
        }
        return ret;
    }
}
