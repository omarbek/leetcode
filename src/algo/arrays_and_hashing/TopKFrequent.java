package algo.arrays_and_hashing;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
//        Arrays.stream(new TopKFrequent().topKFrequent(new int[]{4, 4, 1, 1, 1, 3}, 2)).forEach(System.out::println);
        Arrays.stream(new TopKFrequent().topKFrequent(new int[]{1, 2}, 2)).forEach(System.out::println);
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> freqs = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freqs.add(entry.getValue());
        }
        Collections.sort(freqs, Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < freqs.size(); i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(freqs.get(i)) && !list.contains(entry.getKey())) {
                    list.add(entry.getKey());
                    break;
                }
            }
            if (i == k - 1) {
                break;
            }
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
