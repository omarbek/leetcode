package companies.reasunta;

import java.util.HashSet;
import java.util.Set;

public class LRUCache {
    public static void main(String[] args) {
        System.out.println(LRUCache(new String[]{"A", "B", "A", "C", "A", "B"}));
    }

    public static String LRUCache(String[] strArr) {
        String temp = "";
        Set<String> set = new HashSet<>();
        for (String str : strArr) {
            if (!set.contains(str)) {
                set.add(str);
                if (temp.length() == 5) {
                    temp = temp.substring(1);
                }
            } else {
                temp = temp.replace(str, "");
            }
            temp += str;
        }
        String ret = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            char c = temp.charAt(i);
            if (ret.isEmpty()) {
                ret += c;
            } else {
                ret = ret + "-" + c;
            }
        }
        return ret+":1drm9yh3u";
    }
}
