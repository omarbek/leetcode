package algo.date_20220417;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        int countPositive = 0;
        int countNegative = 0;
        int countOfZero = 0;
        for (Integer i : arr) {
            if (i > 0) {
                countPositive++;
            } else if (i < 0) {
                countNegative++;
            } else {
                countOfZero++;
            }
        }
        System.out.println((double) countPositive / size);
        System.out.println((double) countNegative / size);
        System.out.println((double) countOfZero / size);
    }
}
