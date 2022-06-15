package algo.graphs4;

import java.util.Arrays;

public class NumSubseq {
    public static void main(String[] args) {
        System.out.println(new NumSubseq().numSubseq(new int[]{3, 5, 6, 7}, 9));
    }

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int ret=0;
        int mod=(int)1e9 + 7;
        int len=nums.length;
        int[]temp=new int[len];
        temp[0]=1;
        for(int i=1;i<len;i++){
            temp[i]=temp[i-1]*2%mod;
        }
        int left=0;
        int right=len-1;
        for(int i=0;i<len;i++){
            if(nums[left]+nums[right]>target){
                right--;
            }else{
                ret=(ret+temp[right-left++])%mod;
            }
        }
        return ret;
    }
}
