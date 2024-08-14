package algo.dp;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(4));
    }
    public int climbStairs(int n) {
        int one=1;
        int two=1;
        for(int i=0;i<n-1;i++){
            int temp=one;
            one=one+two;
            two=temp;
        }
        return one;
    }
}
