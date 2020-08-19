package Math;
/*
Problem description: Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21
 */
public class ReverseInt {
    public void main(String[] args) {
        int n = 123;
        int result = reverseInt(n);
        System.out.println(result);
    }
























    private static int reverseInt(int x){
        boolean negative = false;
        if (x < 0){
            negative = true;
            x *= -1;
        }

        int reversed = 0;
        while (x > 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }

        return negative ? (-1 * reversed) : reversed;
    }
}
