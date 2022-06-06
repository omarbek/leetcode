package algo.treenode;

public class IsBalanced {

    public static void main(String[] args) {
        TreeNode rr=new TreeNode(7);
        TreeNode rl=new TreeNode(15);
        TreeNode r=new TreeNode(20,rl,rr);
        TreeNode l=new TreeNode(9);
        TreeNode root=new TreeNode(3,l,r);
        System.out.println(new IsBalanced().isBalanced(root));
    }
    public boolean isBalanced(TreeNode root) {
        if(root!=null){
            int lh=getHeight(root.left,0);
            int rh=getHeight(root.right,0);
            if(Math.abs(lh-rh)>1){
                return false;
            }
            return true;
        }
        return true;
    }

    private int getHeight(TreeNode root,int height) {
        if(root==null){
            return 0;
        }
        int l=getHeight(root.left,height);
        int r=getHeight(root.right,height);
        return Math.max(l,r);
    }
}
