package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author omarbekdinasil
 * on 05.05.2022
 * @project leetcode
 */
public class Jaxel {
    //abcab
    //abc
    public static void main(String[] args) {
        String word = "abcab";
        System.out.println(getResult(word));
    }

    private static String getResult(String word) {
        String ret = "";
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (set.contains(ch)) {
                if (count > max) {
                    max = count;
                    ret = sb.toString();
                }
                set = new HashSet<>();
                sb = new StringBuilder();
                set.add(ch);
                sb.append(ch);
                count = 1;
            } else {
                sb.append(ch);
                set.add(ch);
            }
            count++;
        }
        if (sb.toString().length() > max) {
            return sb.toString();
        }
        return ret;
    }

}
