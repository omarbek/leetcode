package delivery;

import java.util.Arrays;

/**
 * @author omarbekdinasil
 * on 21.04.2022
 * @project leetcode
 */
public class Third {
    public static void main(String[] args) {//
        Arrays.stream(new Third().solution(1, 1)).forEach(System.out::println);
    }

    public int[] solution(int X, int Y) {
        if (X < 2) {
            return new int[]{-1, -1};
        }
        int[] ret = new int[2];
        ret[1] = (Y - 2 * X) / 2;
        ret[0] = X - ret[1];
        return ret;
    }
}
