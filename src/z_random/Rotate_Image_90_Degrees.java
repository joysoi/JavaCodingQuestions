package z_random;

import java.util.Arrays;

public class Rotate_Image_90_Degrees {
    public void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] result = rotate90(array);
        System.out.println(Arrays.deepToString(result));
    }




































    private static int[][] rotate90(int[][] matrix) {
        //transpose
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        // flip horizontally
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
