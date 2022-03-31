package yandex;

import java.util.*;

/**
 * @author omarbekdinasil
 * on 11.02.2022
 * @project leetcode
 */

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        new GroupAnagrams().groupAnagrams(strs).forEach(q -> {
            q.forEach(System.out::println);
            System.out.println();
        });
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = Arrays.toString(chars);
            if (!map.containsKey(sortedStr)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            } else {
                map.get(sortedStr).add(str);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ret.add(entry.getValue());
        }

        return ret;
    }
}
