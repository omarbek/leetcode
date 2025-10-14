package companies.luxoft;

import java.util.*;

public class MatchingCharacters {

    public static String MatchingCharacters(String str) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            List<Integer> indexes = map.get(ch);
            if (indexes == null) {
                indexes = new ArrayList<>();
                indexes.add(i);
                map.put(ch, indexes);
            } else {
                int count = findUniqueChars(indexes.get(0) + 1, i, str);
                if (count > max) {
                    max = count;
                }
                indexes.add(i);
            }
        }
        return max + "";
    }

    private static int findUniqueChars(int first, int second, String str) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = first; i < second; i++) {
            characterSet.add(str.charAt(i));
        }
        return characterSet.size();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MatchingCharacters(s.nextLine()));
    }
}
