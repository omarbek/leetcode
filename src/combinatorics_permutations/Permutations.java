package combinatorics_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Permutations {
    public static void main(String[] args) {
        generatePermutations(Arrays.asList(1, 2, 3))
                .forEach(q -> {
                            q.forEach(w -> System.out.print(w + " "));
                            System.out.println();
                        }
                );
    }

    private static List<List<Integer>> generatePermutations(List<Integer> sequence) {
        List<List<Integer>> perms = new ArrayList<>();
        genPerms(sequence, perms, 0);
        return perms;
    }

    private static void genPerms(List<Integer> sequence, List<List<Integer>> perms, int index) {
        if (index == sequence.size() - 1) {
            perms.add(new ArrayList<>(sequence));
        }
        for (int i = index; i < sequence.size(); i++) {
            swap(sequence, i, index);
            genPerms(sequence, perms, index + 1);
            swap(sequence, i, index);
        }
    }
}
