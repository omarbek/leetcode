package companies.tamara;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    public static void main(String[] args) {
        new Ladder().ladder(4).forEach(System.out::println);
    }

    //4
    //1 1 1 1
    //1 1 2
    //1 2 1
    //2 1 1
    //2 2

    private List<String> ladder(int n) {
        List<String> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        backTrack(res, comb, n);
        return res;
    }

    private void backTrack(List<String> res, List<Integer> comb, int n) {
        int sum = comb.stream().mapToInt(Integer::intValue).sum();
        if (sum > n) {
            return;
        }
        if (sum == n) {
            res.add(transform(new ArrayList<>(comb)));
            return;
        }
        for (int i = 1; i <= 2; i++) {
            comb.add(i);
            backTrack(res, comb, n);
            comb.remove(comb.size() - 1);
        }
    }

    private String transform(List<Integer> comb) {
        StringBuilder sb = new StringBuilder();
        comb.forEach(q -> {
            sb.append(q);
            sb.append(" ");
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
