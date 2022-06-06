package algo.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
//        System.out.println(new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        System.out.println(new BinarySearch().search(new int[]{2,5}, 5));
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int start, int end, int[] nums, int target) {
        int mid = (end + start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if(nums[start]==target){
            return start;
        }
        if(nums[end]==target){
            return end;
        }
        if (nums[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        if (start >= end) {
            return -1;
        }
        return binarySearch(start, end, nums, target);
    }
}
