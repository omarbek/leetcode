package algo.date_20220417;

import java.util.List;

public class SimpleArraySum {

    public static void main(String[] args) {

    }

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(Integer::intValue).sum();
    }
}
