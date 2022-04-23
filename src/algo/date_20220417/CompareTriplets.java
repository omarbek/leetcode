package algo.date_20220417;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    //5 6 7
    //3 6 10

    //1 1
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        compareTriplets(a, b).forEach(System.out::println);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int first = (a.get(0) > b.get(0) ? 1 : 0) + (a.get(1) > b.get(1) ? 1 : 0) + (a.get(2) > b.get(2) ? 1 : 0);
        int second = (a.get(0) < b.get(0) ? 1 : 0) + (a.get(1) < b.get(1) ? 1 : 0) + (a.get(2) < b.get(2) ? 1 : 0);
        return Arrays.asList(first, second);
    }
}
