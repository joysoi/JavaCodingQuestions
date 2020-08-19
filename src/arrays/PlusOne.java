package arrays;

import java.util.Arrays;

/*
Problem description: Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

public class PlusOne {
        public void main(String[] args) {
            int[] ints = {9,9,9};
            int[] result = plusOne(ints);
            System.out.println(Arrays.toString(result));
        }





























        private static int[] plusOne(int[] ints){
            for (int i = ints.length - 1; i >= 0 ; i--) {
                // if i is not 9, we increment i by 1:
                if (ints[i] < 9){
                    ints[i]++;
                    return ints;
                }

                //if it is 9, then we turn i to 0
                ints[i] = 0;
            }

            // if we have 99 -> 999, then we have to add one more hundred:
            int[] result = new int[ints.length + 1];
            //and set the first index to 1:
            result[0] = 1;
            return result;
        }
}
