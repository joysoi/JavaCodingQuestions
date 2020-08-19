package arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
Problem description: Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

Note:
- Each element in the result must be unique.
- The result can be in any order.
 */
public class IntersectionTwoArrays {
    public void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }


































    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int count = 0;
        for (int i : intersection) {
            result[count] = i;
            count++;
        }
        return result;
    }
}
