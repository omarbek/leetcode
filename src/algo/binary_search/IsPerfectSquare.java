package algo.binary_search;

public class IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println(new IsPerfectSquare().isPerfectSquare(16));
    }

    public boolean isPerfectSquare(int num) {
        long left=1;
        long right=num;
        while(left<=right){
            long mid=(left+right)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}
