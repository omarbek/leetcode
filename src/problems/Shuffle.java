package problems;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        Arrays.stream(new Shuffle().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).forEach(System.out::println);
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length/2; i++) {
            ret[count++] = nums[i];
            ret[count++] = nums[i + n];
        }
        return ret;
    }
}
