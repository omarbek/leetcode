package problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(3).forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        List<String> perms = new ArrayList<>();
        genPerm(perms, "", 0, 0, n);
        return perms;
    }

    private void genPerm(List<String> perms, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            perms.add(str);
            return;
        }

        if (open < max) {
            genPerm(perms, str + "(", open + 1, close, max);
        }
        if (close < open) {
            genPerm(perms, str + ")", open, close + 1, max);
        }
    }
}
