package yandex;

import java.util.Stack;

/**
 * @author omarbekdinasil
 * on 10.02.2022
 * @project leetcode
 */
public class ValidParentheses {

    public static void main(String[] args) {
//        System.out.println(new ValidParentheses().isValid("()"));//true
//        System.out.println(new ValidParentheses().isValid("()[]{}"));//true
//        System.out.println(new ValidParentheses().isValid("(]"));//false
//        System.out.println(new ValidParentheses().isValid("([)]"));//false
//        System.out.println(new ValidParentheses().isValid("{[]}"));//true
        System.out.println(new ValidParentheses().isValid("[])"));//true
    }

    String openChars = "([{";
    String closeChars = ")]}";

    public boolean isValid(String s) {
        if (closeChars.contains(s.charAt(0) + "") || openChars.contains(s.charAt(s.length() - 1) + "")) {
            return false;
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String ch = c + "";
            if (openChars.contains(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (openChars.indexOf(stack.peek()) == closeChars.indexOf(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
