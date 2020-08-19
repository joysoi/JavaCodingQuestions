package z_random;
/*
Problem description: The Hamming distance between two integers
is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */
public class Hamming_Distance {
    public void main(String[] args) {
        int x = 1;
        int y = 4;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }
























    private static int hammingDistance(int x, int y) {
        int result = 0;
        while (x > 0 || y > 0) {
            result += (x % 2) ^ (y % 2);
            x >>= 1;
            y >>= 1;
        }
        return result;
    }
}
