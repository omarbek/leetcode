package algo.binary_search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
//        Arrays.stream(new SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{}, 0)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{2,2}, 2)).forEach(System.out::println);
        Arrays.stream(new SearchRange().searchRange(new int[]{2,2}, 1)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{1,3}, 1)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{3, 3, 3}, 3)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{5,7,7,8,8,10}, 8)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{1, 2, 3, 3, 3, 3, 4, 5, 9}, 3)).forEach(System.out::println);
//        Arrays.stream(new SearchRange().searchRange(new int[]{1, 2, 3}, 1)).forEach(System.out::println);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[]{-1, -1};
        if (nums.length == 0) {
            return ret;
        }
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
            }
            return ret;
        }
        ret[0] = findFirst(0, nums.length - 1, nums, target);
        if(ret[0]==-1){
            ret[1]=-1;
            return ret;
        }
        ret[1] = findLast(ret[0], nums.length - 1, nums, target);
        return ret;
    }

    private int findLast(int start, int end, int[] nums, int target) {
        if (start >= end) {
            if (nums[start] == target) {
                return start;
            }
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            if (mid == nums.length - 1) {
                return mid;
            }
            mid++;
            while (nums[mid] == target) {
                mid++;
                if (mid > nums.length - 1) {
                    break;
                }
            }
            return mid - 1;
        }
        if (nums[mid] < target) {
            return findLast(mid + 1, end, nums, target);
        }
        return findLast(start, mid - 1, nums, target);
    }

    private int findFirst(int start, int end, int[] nums, int target) {
        if (start >= end) {
            if (nums[start] == target) {
                return start;
            }
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            if (mid == 0) {
                return 0;
            }
            mid--;
            while (nums[mid] == target) {
                mid--;
                if (mid < 0) {
                    break;
                }
            }
            return mid + 1;
        }
        if (nums[mid] < target) {
            return findFirst(mid + 1, end, nums, target);
        }
        return findFirst(start, mid - 1, nums, target);
    }
}
