package algo.treenode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    public static void main(String[] args) {
//        TreeNode third = new TreeNode(3);
//        TreeNode second = new TreeNode(2, third, null);
//        TreeNode root = new TreeNode(1, null, second);

        TreeNode root=new TreeNode(1);
        new PreorderTraversal().preorderTraversal(root).forEach(System.out::println);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = addToList(root, new ArrayList<>());
        return list;
    }

    private List<Integer> addToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            addToList(root.left, list);
            addToList(root.right, list);
        }
        return list;
    }
}
