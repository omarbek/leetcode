package companies.yandex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author omarbekdinasil
 * on 26.02.2022
 * @project leetcode
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidPalindrome().isPalindrome("aabbaa"));
        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
        System.out.println(new ValidPalindrome().isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {
        StringBuilder wordSB = new StringBuilder();
        String nonAlphanumeric = "abcdefghijklmnopqrstuvwxyz0123456789";
        List<Character> characters = new ArrayList<>();
        for (char c : nonAlphanumeric.toCharArray()) {
            characters.add(c);
        }
        for (char c : s.toLowerCase().toCharArray()) {
            if (characters.contains(c)) {
                wordSB.append(c);
            }
        }
        String word = wordSB.toString();
        StringBuilder anagramSB = new StringBuilder();
        int until;
        if (word.length() % 2 == 0) {
            until = word.length() / 2 - 1;
        } else {
            until = word.length() / 2;
        }
        for (int i = word.length() - 1; i > until; i--) {
            anagramSB.append(word.charAt(i));
        }
        return word.substring(0, word.length() / 2).equals(anagramSB.toString());
    }
}
