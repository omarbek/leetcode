package problems.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Four {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,3,4,19,7,2,5,11);
        Stack stack=new Stack();
        Integer old;
        for(Integer i:list){
            old=i;
            if(i%2==1){
                stack.push(i);
            }else{
                old = (Integer) stack.pop();
                if(old>i){
                    stack.push(i);
                }
            }
        }
        System.out.println(stack.peek());
    }
}
