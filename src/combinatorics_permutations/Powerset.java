package combinatorics_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Powerset {
    public static void main(String[] args) {
        generatePowerset(Arrays.asList('a', 'b', 'c'))
                .forEach(q -> {
                            q.forEach(w -> System.out.print(w + " "));
                            System.out.println();
                        }
                );
    }

    private static List<List<Character>> generatePowerset(List<Character> sequence) {
        List<List<Character>> powerset = new ArrayList<>();
        powerSetInternal(sequence, powerset, new ArrayList<>(), 0);
        return powerset;
    }

    private static void powerSetInternal(List<Character> set, List<List<Character>> powerset,
                                         List<Character> accumulator, int index) {
        if (index == set.size()) {
            powerset.add(new ArrayList<>(accumulator));
        } else {
            accumulator.add(set.get(index));
            powerSetInternal(set, powerset, accumulator, index + 1);
            accumulator.remove(accumulator.size() - 1);
            powerSetInternal(set, powerset, accumulator, index + 1);
        }
    }
}
