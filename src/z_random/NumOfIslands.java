package z_random;
/*
1. Problem description: Given a 2d grid map of '1's (land) and '0's (water),
count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands
horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.
Example 1:
Input:
11110
11010
11000
00000
Output: 1

Example 2:
Input:
11000
11000
00100
00011
Output: 3

 */
public class NumOfIslands {
    public static void main(String[] args) {
        char[][] grid =
                       {{'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}};
        Solution solution = new Solution();
        int result = solution.numOfIslands(grid);
        System.out.println(result);
    }

































    public static class Solution {
        private int numOfIslands(char[][] grid) {
            int numOfIslands = 0;
            if (grid == null || grid.length == 0) {
                return 0;
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        numOfIslands += dfs(grid, i, j);
                    }
                }
            }
            return numOfIslands;
        }

        private int dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
                return 0;
            }
            // so we do not revisit the '1', we set the fields as '0'"
            grid[i][j] = '0';
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
            return 1;
        }

    }
}


