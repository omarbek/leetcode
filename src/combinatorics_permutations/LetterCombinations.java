package combinatorics_permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public static void main(String[] args) {
        new LetterCombinations().letterCombinations("").forEach(System.out::println);
    }

    private static final Map<String, String> digitToChar = Map.of(
            "2", "abc",
            "3", "def",
            "4", "ghi",
            "5", "jkl",
            "6", "mno",
            "7", "pqrs",
            "8", "tuv",
            "9", "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) {
            return res;
        }
        String curStr = "";
        backTrack(0, curStr, res, digits);
        return res;
    }

    private void backTrack(int i, String curStr, List<String> res, String digits) {
        if (curStr.length() == digits.length()) {
            res.add(curStr);
            return;
        }
        String digit = digitToChar.get(digits.charAt(i) + "");
        for (int j = 0; j < digit.length(); j++) {
            char c = digit.charAt(j);
            backTrack(i + 1, curStr + c, res, digits);
        }
    }
}
