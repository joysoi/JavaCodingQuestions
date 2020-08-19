package z_random;
/*

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path which sum is 22.

 */
public class Path_Sum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(22);
        boolean result = hasPathSum(root, 22);
        System.out.println(result);
    }

































    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && sum - root.val == 0){
            return true;
        }else {
            return hasPathSum(root.left, sum - root.val) ||
                    hasPathSum(root.right, sum - root.val);
        }
    }
}
