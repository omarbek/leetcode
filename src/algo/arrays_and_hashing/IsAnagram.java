package algo.arrays_and_hashing;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new IsAnagram().isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        char[] ts = t.toCharArray();
        Arrays.sort(ts);
        return new String(ss).equals(new String(ts));
    }
}
