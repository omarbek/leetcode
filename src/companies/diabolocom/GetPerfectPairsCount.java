package companies.diabolocom;

import java.util.Arrays;
import java.util.List;

public class GetPerfectPairsCount {

    public static void main(String[] args) {
        long perfectPairsCount = getPerfectPairsCount(Arrays.asList(-9, 6, -2, 1));
        System.out.println(perfectPairsCount);
    }

    public static long getPerfectPairsCount(List<Integer> arr) {
        long count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int first = arr.get(i);
                int second = arr.get(j);
                int diff = Math.abs(first - second);
                int sum = Math.abs(first + second);
                int firstAbs = Math.abs(first);
                int secondAbs = Math.abs(second);
                if (Math.min(diff, sum) <= Math.min(firstAbs, secondAbs)
                        && Math.max(diff, sum) >= Math.max(firstAbs, secondAbs)) {
                    count++;
                }
            }
        }
        return count;
    }
}
