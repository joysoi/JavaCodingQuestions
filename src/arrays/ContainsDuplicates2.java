package arrays;

import java.util.HashMap;
/*
Problem description: Given an array of integers and an integer k,
find out whether there are two distinct indices i and j in the array such
that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
 */

public class ContainsDuplicates2 {

    public void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = containNearbyDuplicates(nums, k);
        System.out.println(result);
    }


























    private static boolean containNearbyDuplicates(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }
}

