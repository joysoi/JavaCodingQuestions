package Math;
/*
Problem description: Given an integer, write a function to determine if it is a power of two.

Example 1:
Input: 1
Output: true
Explanation: 20 = 1

Example 2:
Input: 16
Output: true
Explanation: 24 = 16

Example 3:
Input: 218
Output: false
 */
public class PowerOfTwo {
    public void main(String[] args) {
        int number = 4;
        boolean powerOfTwo = isPowerOfTwo(number);
        if (powerOfTwo) System.out.println(true);
        else System.out.println(false);
    }

























    private static boolean isPowerOfTwo(int n) {
        long i = 1;
        if (i < n) {
            i *= 2;
        }
        return i == n;
    }

}
