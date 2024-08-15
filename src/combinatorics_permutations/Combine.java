package combinatorics_permutations;

import java.util.ArrayList;
import java.util.List;

public class Combine {

    //1 2
    //1 3
    //1 4
    //2 3
    //2 4
    //3 4

    public static void main(String[] args) {
        new Combine().combine(4, 2).forEach(q -> {
            q.forEach(w -> System.out.print(w + " "));
            System.out.println();
        });
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        backTrack(1, n, k, ret, comb);
        return ret;
    }

    private void backTrack(int start, int n, int k, List<List<Integer>> ret, List<Integer> comb) {
        if (comb.size() == k) {
            ret.add(new ArrayList<>(comb));
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            backTrack(i + 1, n, k, ret, comb);
            comb.remove(comb.size() - 1);
        }
    }
}
