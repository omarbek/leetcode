package companies.moniepoint;

import java.util.Arrays;
import java.util.List;

public class BalancedSum {

    public static int balancedSum(List<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        int left = 0;
        for (int i = 0; i < arr.size(); i++) {
            int right = total - left - arr.get(i);
            if (left == right) {
                return i;
            }
            left += arr.get(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(balancedSum(Arrays.asList(1, 2, 3, 4, 6)));
    }
}
