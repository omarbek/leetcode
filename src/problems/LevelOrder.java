package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        new LevelOrder().levelOrder(root).forEach(q -> q.forEach(System.out::println));
    }

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<>();
//        deep(root, 0);
//        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            ret.add(entry.getValue());
//        }
//        return ret;
//    }
//
//    Map<Integer, List<Integer>> map = new HashMap<>();
//
//    private void deep(TreeNode root, int level) {
//        level++;
//        if (root != null) {
//            if (root.left == null && root.right == null) {
//                addToMap(root, level);
//            } else {
//                addToMap(root, level);
//                if (root.left != null) {
//                    deep(root.left, level);
//                }
//                if (root.right != null) {
//                    deep(root.right, level);
//                }
//            }
//        }
//    }
//
//    private void addToMap(TreeNode root, int level) {
//        if (map.containsKey(level)) {
//            List<Integer> value = map.get(level);
//            value.add(root.val);
//            map.put(level, value);
//        } else {
//            List<Integer> value = new ArrayList<>();
//            value.add(root.val);
//            map.put(level, value);
//        }
//    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return ret;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                list.add(queue.poll().val);
            }
            ret.add(list);
        }
        return ret;
    }
}
