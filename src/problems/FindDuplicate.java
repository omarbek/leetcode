package problems;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(new FindDuplicate().findDuplicate(new int[]{3,1,3,4,2}));
    }
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return 0;
    }
}
