package z_random;

/*
Lowest Common Ancestor of a Binary Search Tree
 */
public class Lowest_Common_Ancestor {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        TreeNode result = LCA(treeNode, treeNode.left, treeNode.right);
        System.out.println(result);
    }

































    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            LCA(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            LCA(root.right, p, q);
        }
        return root;

    }
}
