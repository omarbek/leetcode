package algo.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(9, 8, 9);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }
                if ((i + j) == (arr.get(0).size() - 1)) {
                    sum2 += arr.get(i).get(j);
                }
            }
        }
        if (sum1 > sum2) {
            return sum1 - sum2;
        }
        return sum2 - sum1;
    }
}
