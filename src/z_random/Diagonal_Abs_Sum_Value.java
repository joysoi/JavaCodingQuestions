package z_random;
/*
Problem description: Calculate the absolute sum of the two diagonals of the 2D array
 */
public class Diagonal_Abs_Sum_Value {
    public  void main(String[] args) {
        int[][] grid = {
                {3, 4, 5},
                {4, 3, 2},
                {1, 4, 5}};
        int result = diagonalAbsSumValue(grid);
        System.out.println(result);
    }































    private static int diagonalAbsSumValue(int[][] grid) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < grid.length; i++) {
            sumOne += grid[i][i];
            sumTwo += grid[grid.length - 1 - i][i];
        }

        return Math.abs(sumOne + sumTwo);
    }

}
