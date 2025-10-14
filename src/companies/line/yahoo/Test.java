package companies.line.yahoo;

import java.util.Arrays;

public class Test {

    public int solution(int[] A) {
        Arrays.sort(A);
        int ret = 1;
        for (int i : A) {
            if (i == ret) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Test().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
