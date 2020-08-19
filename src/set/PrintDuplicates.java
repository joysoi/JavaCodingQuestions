package set;
/*
Problem description: Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashSet;

public class PrintDuplicates {
    public void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        boolean b = containDuplicates(ints);
        System.out.println(b);
    }






















    private static boolean containDuplicates(int[] ints) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : ints) {
            if (hashSet.contains(i)) {
                return true;
            } else {
                hashSet.add(i);
            }
        }
        return false;
    }
}
