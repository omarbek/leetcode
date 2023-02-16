package companies.yandex;


/**
 * @author omarbekdinasil
 * on 17.02.2022
 * @project leetcode
 */
public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(2);
        root.right = right;
        right.left = new TreeNode(4);
        right.right = new TreeNode(3);

        System.out.println(new SymmetricTree().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        boolean b1 = check(left.left, right.right);
        boolean b2 = check(left.right, right.left);
        return b1 && b2;
    }
}
