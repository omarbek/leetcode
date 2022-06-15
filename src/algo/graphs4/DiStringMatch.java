package algo.graphs4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiStringMatch {
    public static void main(String[] args) {
//        Arrays.stream(new DiStringMatch().diStringMatch("IDID")).forEach(System.out::println);
        Arrays.stream(new DiStringMatch().diStringMatch("DDI")).forEach(System.out::println);
    }

    public int[] diStringMatch(String s) {
        int[] ret = new int[s.length() + 1];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                ret[i] = count++;
            }
        }
        ret[s.length()]=count++;
        for (int i = s.length()-1; i >=0; i--) {
            char ch = s.charAt(i);
            if (ch == 'D') {
                ret[i] = count++;
            }
        }
        return ret;
    }
}
