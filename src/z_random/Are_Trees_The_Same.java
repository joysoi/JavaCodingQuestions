package z_random;

/*
Example 1:
Input:
      5
     / \
    4   8
      VS
      5
     / \
    4   8
Output: true
 */


//private static boolean areTreesSame(TreeNode p, TreeNode q){
//
//        }





























public class Are_Trees_The_Same {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
