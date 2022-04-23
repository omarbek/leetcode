package algo.date_20220417;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);//2063136757 2744467344
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (Integer i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        System.out.print(sum - max);
        System.out.print(" ");
        System.out.print(sum - min);
    }
}
