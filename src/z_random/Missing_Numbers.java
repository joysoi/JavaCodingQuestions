package z_random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Problem description: Given an array of integers where each element
in the array is between 1 and n (inclusive)
(n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]
 */
public class Missing_Numbers {
    public void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findMissingNumbers(nums);
        System.out.println(result);
    }

























    private static List<Integer> findMissingNumbers(int[] nums){
        List<Integer> missingNumbers = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
