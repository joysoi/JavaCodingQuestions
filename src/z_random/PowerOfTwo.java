package z_random;
/*
Problem description: Given an integer, write a function to determine if given number
is a power of two.

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
        int number = 16;
        boolean result = isPowerOfTwo(number);
        System.out.println(result);
    }

























    private static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i *= 2;
        }
        return i == n;
    }

}
