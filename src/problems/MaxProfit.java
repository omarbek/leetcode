package problems;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int diff;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            diff=prices[i]-min;
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }
}
