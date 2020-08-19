package z_random;
/*
Problem description: Given an array where elements are sorted in ascending order,
convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which
the depth of the two subtrees of every node never differ by more than 1.

Example:
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents
the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10 5
 */
public class Convert_Sorted_Array_To_Binary_Search_Tree {
        public void main(String[] args) {
            int[] nums = {-10, -3, 0, 5, 9};
            TreeNode node = sortedArrayToBST(nums);
            System.out.print(node);
        }

























        public static class TreeNode {
            int data;
            TreeNode leftChild;
            TreeNode rightChild;
            TreeNode(int dataSize) {
                data = dataSize;
            }
            @Override
            public String toString() {
                return data +
                        " leftChild= " + leftChild +
                        " rightChild= " + rightChild;
            }
        }
        private static TreeNode sortedArrayToBST(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            if (nums.length == 0) {
                return null;
            }
            return constructBSTRecursive(nums, start, end);
        }

        private static TreeNode constructBSTRecursive(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode current = new TreeNode(nums[mid]);
            current.leftChild = constructBSTRecursive(nums, start, mid - 1);
            current.rightChild = constructBSTRecursive(nums, mid + 1, end);
            return current;
        }
    }

