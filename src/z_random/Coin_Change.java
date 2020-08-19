package z_random;
/*
Problem description:
You are given coins of different denominations and a total sum of money.
Write a function to compute the number of combinations that make up that
sum of money.
Example 1:
Input: coins = [1, 2, 5], totalSum = 5;
Output: 4
*/
public class Coin_Change {
    public void main(String[] args) {
        int[] coins = {1, 2, 5};
        int totalSum = 5;
        int result = coinChange(totalSum, coins);
        System.out.println(result);
    }




























    private static int coinChange(int totalSum, int[] coins) {
        int[] combinations = new int[totalSum + 1];
        combinations[0] = 1;
        for (int coin : coins) {
            for (int amount = 1; amount < combinations.length; amount++) {
                if (amount >= coin) {
                    combinations[amount] += combinations[amount - coin];
                }
            }
        }
        return combinations[totalSum];
    }
}
