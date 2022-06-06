package algo.treenode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode third = new TreeNode(3);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode root = new TreeNode(1, null, second);

        new InorderTraversal().inorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = addToList(root, new ArrayList<>());
        return list;
    }

    private List<Integer> addToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            addToList(root.left, list);
            list.add(root.val);
            addToList(root.right, list);
        }
        return list;
    }
}
