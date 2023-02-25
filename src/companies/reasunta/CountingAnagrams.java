package companies.reasunta;

import java.util.*;

public class CountingAnagrams {
    public static void main(String[] args) {
        System.out.println(CountingAnagrams("aa aa odg dog gdo"));
    }

    public static String CountingAnagrams(String arg) {
        StringTokenizer stringTokenizer = new StringTokenizer(arg, " ");
        Set<String> strs = new HashSet<>();
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            strs.add(token);
        }
        int count = 0;
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
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            if(entry.getValue().size()>1){
                count+=(entry.getValue().size()-1);
            }
        }
        return count + "";
    }
}
