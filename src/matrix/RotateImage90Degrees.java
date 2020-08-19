package matrix;

import java.util.Arrays;

public class RotateImage90Degrees {
    public void main(String[] args) {
        int[][] array = {{1, 2, 3},//  1 4 7  // 7 4 1
                         {4, 5, 6},//  2 5 8  // 8 5 2
                         {7, 8, 9}};// 3 6 9  // 9 6 3
        int[][] result = rotate90(array);
        System.out.println(Arrays.deepToString(result));
    }




































    private static int[][] rotate90(int[][] matrix) {
        //transpose - (turning the rows in columns and vise versa)
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        // flip the array elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
