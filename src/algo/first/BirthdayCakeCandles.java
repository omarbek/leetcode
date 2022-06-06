package algo.first;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        for (Integer i : candles) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        for (Integer i : candles) {
            if (i >= max) {
                count++;
            }
        }
        return count;
    }
}
