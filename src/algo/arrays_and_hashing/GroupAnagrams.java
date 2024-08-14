package algo.arrays_and_hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).stream()
                .forEach(System.out::println);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (map.containsKey(sortedStr)) {
                List<String> list = map.get(sortedStr);
                list.add(str);
                map.put(sortedStr, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ret.add(entry.getValue());
        }
        return ret;
    }
}
