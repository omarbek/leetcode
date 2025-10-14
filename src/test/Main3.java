package test;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {-1, 10, 1, -2, 2, 0, 0};//-1,1,-2,2
        new Main3().invoke(arr).forEach(System.out::println);
    }

    private List<List<Integer>> invoke(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i : arr) {
            list.add(i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int pair = -arr[i];
            if (list.contains(pair)) {
                List<Integer> e;
                if (arr[i] < pair) {
                    e = List.of(arr[i], pair);
                } else {
                    e = List.of(pair, arr[i]);
                }
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
//            Integer pair = findPair(arr, i + 1, arr[i]);
//            if (pair == null) {
//                continue;
//            }
//            ret.add(List.of(arr[i], pair));
        }
        return ret;
    }

//    private Integer findPair(int[] arr, int index, int pair) {
//        if (index == arr.length) {
//            return null;
//        }
//        if (arr[index] + pair == 0) {
//            return arr[index];
//        }
//        return findPair(arr, index + 1, pair);
//    }
}
