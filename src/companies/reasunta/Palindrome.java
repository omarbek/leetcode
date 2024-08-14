package companies.reasunta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

    public static String Palindrome(String str) {
        StringBuilder wordSB = new StringBuilder();
        String onlyLetters = "abcdefghijklmnopqrstuvwxyz";
        List<Character> characters = new ArrayList<>();
        for (char c : onlyLetters.toCharArray()) {
            characters.add(c);
        }
        for (char c : str.toLowerCase().toCharArray()) {
            if (characters.contains(c)) {
                wordSB.append(c);
            }
        }
        String word = wordSB.toString();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            System.out.println(word.charAt(word.length() - i - 1));
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return String.valueOf(false);
            }
        }
        return String.valueOf(true);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Palindrome(s.nextLine()));
    }
}
