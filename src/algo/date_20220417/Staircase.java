package algo.date_20220417;

import java.util.Arrays;

public class Staircase {
    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        char[] ch = new char[n];
        Arrays.fill(ch, ' ');
        for (int i = 0; i < n; i++) {
            ch[n - i - 1] = '#';
            System.out.println(ch);
        }
    }
}
