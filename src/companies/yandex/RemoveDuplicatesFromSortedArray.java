package companies.yandex;

/**
 * @author omarbekdinasil
 * on 16.02.2022
 * @project leetcode
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int x = 0;
        int y = 1;
        nums[x] = nums[0];
        while (y < nums.length) {
            if (nums[x] != nums[y]) {
                x++;
                nums[x] = nums[y];
            }
            y++;
        }
        return x + 1;
    }
}
