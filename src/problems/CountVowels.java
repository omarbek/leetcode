package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(new CountVowels().countVowels("aba"));
    }

    public long countVowels(String word) {
        List<List<Character>> powerSet = new ArrayList<>();
        List<Character> set = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        genPowerSet(set, powerSet, new ArrayList<>(), 0);
        for (Iterator<List<Character>> iter = powerSet.iterator(); iter.hasNext(); ) {
            if(iter.next().isEmpty()){
                iter.remove();
            }
        }
        return powerSet.size();
    }

    private void genPowerSet(List<Character> set, List<List<Character>> powerSet, List<Character> accum, int index) {
        if (index == set.size()) {
            powerSet.add(new ArrayList<>(accum));
        } else {
            accum.add(set.get(index));
            genPowerSet(set, powerSet, accum, index + 1);
            accum.remove(accum.size() - 1);
            genPowerSet(set, powerSet, accum, index + 1);
        }
    }
}
