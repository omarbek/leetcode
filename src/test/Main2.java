package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main2 {

    //we have a HashMap<String, Integer> and need to write a method to remove entries with negative values

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", -3);
        removeNegativeValues(map);
        System.out.println();
    }

    private static void removeNegativeValues(Map<String, Integer> map) {
        Set<String> set= new HashSet<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()<0){
                set.add(entry.getKey());
            }
        }
        for(String s:set){
            map.remove(s);
        }
    }
}
