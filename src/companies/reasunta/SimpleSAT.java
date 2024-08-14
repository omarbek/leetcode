package companies.reasunta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.swap;

public class SimpleSAT {

    public static String SimpleSAT(String str) {
        Set<Character> letters = new HashSet<>(5);
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isLetter(letter)) {
                letters.add(letter);
            }
        }
        List<Character> originChars = new ArrayList<>(letters);
        List<List<Character>> permOfChars = generatePermutations(originChars);
        List<Boolean> booleans = new ArrayList<>();
        for (List<Character> list : permOfChars) {
            for (int i = 0; i < 3; i++) {
                booleans.add(list.get(i) == originChars.get(i));
            }
            if (calculate(originChars, booleans, str)) {
                return String.valueOf(true);
            }
        }

        return String.valueOf(false);
    }

    private static boolean calculate(List<Character> originChars, List<Boolean> booleans, String str) {
        String calc = "";
        for (int i = 0; i < 3; i++) {
            calc = str.replaceAll(originChars.get(i) + "", booleans.get(i).toString());
        }
        return Boolean.parseBoolean(calc);
    }

    private static List<List<Character>> generatePermutations(List<Character> sequence) {
        List<List<Character>> perms = new ArrayList<>();
        genPerms(sequence, perms, 0);
        return perms;
    }

    private static void genPerms(List<Character> sequence, List<List<Character>> perms, int index) {
        if (index == sequence.size() - 1) {
            perms.add(new ArrayList<>(sequence));
        }
        for (int i = index; i < sequence.size(); i++) {
            swap(sequence, i, index);
            genPerms(sequence, perms, index + 1);
            swap(sequence, i, index);
        }
    }

    public static void main(String[] args) {
        System.out.println(SimpleSAT("(a&b)|c"));
//        System.out.println(simpleSAT("(a&b&c)|~a"));
//        System.out.println(simpleSAT("a&(b|c)&~b&~c"));
    }
}
