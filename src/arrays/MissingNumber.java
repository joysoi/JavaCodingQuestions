package arrays;

import java.util.HashSet;

/*
Problem description: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:
Input: [3,0,1]
Output: 2

Example 2:
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
 */
public class MissingNumber {
    public void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = printMissingNumber(nums);
        System.out.println(result);
    }





























    private static int printMissingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
