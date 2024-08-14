package algo.arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int lastNum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==lastNum){
                return true;
            }
            lastNum=i;
        }
        return false;
    }
}
