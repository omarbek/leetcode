package combinatorics_permutations;

import java.util.ArrayList;
import java.util.List;

public class Combine {

    public static void main(String[] args) {
        new Combine().combine(4, 2).forEach(q -> {
            q.forEach(System.out::print);
            System.out.println();
        });
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        backTrack(1, comb, res, n, k);
        return res;
    }

    private void backTrack(int start, List<Integer> comb, List<List<Integer>> res, int n, int k) {
        if (comb.size() == k) {
            res.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i < n + 1; i++) {
            comb.add(i);
            backTrack(i + 1, comb, res, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
