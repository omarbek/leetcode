package algo.first;

import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {

    public static void main(String[] args) {
        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        System.out.println(aVeryBigSum(ar));
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long l : ar) {
            sum += l;
        }
        return sum;
    }
}
