package companies.Tinkoff;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        Arrays.stream(new Second().searchRange(new int[]{5, 6, 7, 7, 8, 8, 10}, 8)).forEach(System.out::println);//4,5
        Arrays.stream(new Second().searchRange(new int[]{5, 6, 8, 8, 8, 8, 10}, 8)).forEach(System.out::println);//2,5
        Arrays.stream(new Second().searchRange(new int[]{1, 3}, 1)).forEach(System.out::println);//0,0
        Arrays.stream(new Second().searchRange(new int[]{1, 4}, 4)).forEach(System.out::println);//1,1
        Arrays.stream(new Second().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).forEach(System.out::println);//3,4
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] < target) {
                begin = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                if (mid > 0 && nums[mid - 1] == target) {
                    end--;
                } else {
                    ret[0] = mid;
                    break;
                }
            }
        }
        int index = ret[0] + 1;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == target) {
                ret[1] = i;
            } else {
                break;
            }
        }
        if (ret[1] == -1) {
            ret[1] = ret[0];
        }
        return ret;
    }
}
