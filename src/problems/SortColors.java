package problems;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 0};
        new SortColors().sortColors(nums);
        System.out.println();
    }
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}
