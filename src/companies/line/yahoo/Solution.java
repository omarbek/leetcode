package companies.line.yahoo;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        new Solution().solution(new int[]{1, 2, 3, 4, 5}, 6);
    }

    public int[] solution(int[] numbers, int target) {
        int[] ret = new int[2];
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int j = target - numbers[i];
            if (set.contains(j)) {
                ret[0] = numbers[i];
                ret[1] = j;
                break;
            }
        }
        return ret;
    }
}
