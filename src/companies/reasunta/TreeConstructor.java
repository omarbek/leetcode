package companies.reasunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeConstructor {

    public static String treeConstructor(String[] strArr) {
        Map<Integer, List<Integer>> pairs = new HashMap<>();
        for (String str : strArr) {
            int child = Integer.parseInt(str.charAt(1) + "");
            int parent = Integer.parseInt(str.charAt(3) + "");
            if (pairs.containsKey(parent)) {
                List<Integer> children = pairs.get(parent);
                if (children.size() == 2) {
                    return String.valueOf(false);
                }
                children.add(child);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(child);
                pairs.put(parent, list);
            }
        }
        int childrenSize = 0;
        for (Map.Entry<Integer, List<Integer>> entry : pairs.entrySet()) {
            childrenSize += entry.getValue().size();
        }
        return String.valueOf(childrenSize == strArr.length);

//        Set<String> children = new HashSet<>();
//        Map<String, Integer> parents = new HashMap<>();
//        for (String node : strArr) {
//            String[] values = node.replaceAll("[^0-9,]", "").split(",");
//            children.add(values[0]);
//            Integer count = parents.get(values[1]);
//            if (count != null && count + 1 > 2) {
//                return "false";
//            } else {
//                parents.put(values[1], (count == null ? 1 : ++count));
//            }
//        }
//        return "" + (children.size() == strArr.length);
    }

    public static void main(String[] args) {
        System.out.println(treeConstructor(new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
    }
}
