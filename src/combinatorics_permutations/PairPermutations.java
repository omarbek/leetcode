package combinatorics_permutations;

import java.util.ArrayList;
import java.util.List;

public class PairPermutations {

    public static void main(String[] args) {
        List<List<Integer>> result = new PairPermutations().function();

        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("size: " + result.size());
    }

    public List<List<Integer>> function() {
        int[] dataSet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet.length; j++) {
                if (i == j)
                    continue;
                List<Integer> tmp = new ArrayList<>();
                tmp.add(dataSet[i]);
                tmp.add(dataSet[j]);
                result.add(tmp);
            }
        }

        return result;
    }
}
