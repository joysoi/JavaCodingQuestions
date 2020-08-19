package z_random;

import java.util.HashMap;

/*
Problem description:
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the
majority element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class Majority_Element {
    public void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElements(nums);
        System.out.println(result);
    }


























    private static int majorityElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) && map.get(i) + 1 > nums.length / 2) {
                return i;
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        return -1;
    }
}
