package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        //o13[a]2[bc]
        //aaabcbc

        //3[a2[c]]
        //accaccacc

        //2[abc]3[cd]ef
        //abcabccdcdcdef

        //{[()]}

        convert("{[()]}");
    }

    static List<Character> opens= Arrays.asList('{','[','(');
   static List<Character> closes= Arrays.asList('}',']',')');

    private static boolean convert(String s) {
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(opens.contains(c)){
                stack.push(c);
            }else{
//                if(stack.peek().equals())
            }

        }
        return false;
    }
}
