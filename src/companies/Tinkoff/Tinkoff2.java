package companies.Tinkoff;

import java.util.HashMap;
import java.util.Map;

public class Tinkoff2 {
    // Даны две строки. Вывести, существует ли такое сопоставление между
// их символами, что одна строка переводится в другую и при этом
// никаким двум разным буквам не сопоставляется одна и та же.
// isSimilar("egg","add") => true
    //agg
    //add
// isSimilar("foo","bar") => false
// isSimilar("kotlin","python") => true
    public static void main(String[] args) {
//        System.out.println(new Tinkoff2().isSimilar("egg", "add"));//true
        System.out.println(new Tinkoff2().isSimilar("bar", "foo"));//false
//        System.out.println(new Tinkoff2().isSimilar("kotlin", "python"));//true
    }

    private boolean isSimilar(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> secMap = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char f = first.charAt(i);
            char s = second.charAt(i);
            if (!map.containsKey(f)) {
                map.put(f, s);//b f
            } else {
                if (map.get(f) != s) {
                    return false;
                }
            }
            secMap.put(s,f);
        }
        return true;
    }
}
