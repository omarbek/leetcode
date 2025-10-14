package problems;

public class RemoveDuplicates80 {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates80().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        int ret = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count > 1) {
                    continue;
                }
                count++;
            } else {
                count = 0;
            }
            nums[ret++] = nums[i];
        }
        return ret;
    }
}
