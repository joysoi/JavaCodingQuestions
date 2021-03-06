package z_random;
/*
Problem description: You are climbing a stair case.
It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps.
In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
public class Climbing_Stairs {
    public void main(String[] args) {
        int n = 5;
        int result = climbSteps(n);
        System.out.println(result);
    }















    private static int climbSteps(int n){
        int[] waysToClimb = new int[n + 1];
        waysToClimb[0] = 1;
        waysToClimb[1] = 1;
        for (int i = 2; i <= n; i++) {
            waysToClimb[i] = waysToClimb[i - 1] + waysToClimb[i - 2];
        }
        return waysToClimb[n];
    }
}
