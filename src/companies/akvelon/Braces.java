package companies.akvelon;

import java.util.Map;
import java.util.Stack;

public class Braces {

    public static void main(String[] args) {
        //()[]{} true
        //([]) - true
        //)( - false
        //([)] - false
        System.out.println(balanced("()[]{}"));//true
        System.out.println(balanced("([])"));//true
        System.out.println(balanced(")("));//false
        System.out.println(balanced("([)]"));//false
        System.out.println(balanced(")}]"));//false
    }

    private static boolean balanced(String s) {
        Map<Character, Character> map = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(ch) == stack.get(stack.size() - 1)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
