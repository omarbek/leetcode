package algo.binary_search;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(5));
    }

    public int arrangeCoins(int n) {
        int left=1;
        int right=n/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            int coinsFilled=mid*(mid+1)/2;
            if(coinsFilled==n){
                return mid;
            }
            if(coinsFilled>n){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}
