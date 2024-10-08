package companies.mercari;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vowelsubstring {
    public static void main(String[] args) {
        System.out.println(vowelsubstring("aaeiouxa"));
    }

    public static long vowelsubstring(String s) {
        long ret = 0;
        Set<Character> chars;
        List<Character> all = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length() - 4; i++) {
            chars = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (all.contains(ch)) {
                    chars.add(ch);
                    if (chars.size() == 5) {
                        ret++;
                    }
                } else {
                    break;
                }
            }
        }
        return ret;
    }
}
