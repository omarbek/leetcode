package algo.binary_search;

public class CountNegatives {
    public static void main(String[] args) {
        int[][] grid=new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(new CountNegatives().countNegatives(grid));
    }
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int left=0;
            int right= grid[0].length-1;
            while (left<=right){
                int mid=left+(right-left)/2;
                if(grid[i][mid]==0){
                    count+=(grid[0].length-mid);
                }else if(grid[i][mid]>0){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            count+=(grid[0].length-left);
        }
        return count;
    }
}
