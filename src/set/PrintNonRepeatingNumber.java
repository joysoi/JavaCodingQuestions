package set;

import java.util.HashSet;

/*
Problem Description: Given a non-empty array of integers,
every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */
public class PrintNonRepeatingNumber {
        public void main(String[] args) {
            int[] ints = {4, 1, 2, 1, 2};
            int i = singleNumber(ints);
            System.out.println(i);
        }


























        private static int singleNumber(int[] ints) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i : ints) {
                if (hashSet.contains(i)) {
                    hashSet.remove(i);
                } else {
                    hashSet.add(i);
                }
            }
            for (int i : hashSet) {
                return i;
            }
            return -1;
        }
}
