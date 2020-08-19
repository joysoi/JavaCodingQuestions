package z_random;

import java.util.Arrays;

/*
Flipping an Image.
 */
public class Flip_Image {
    public void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flipImage(image);
        System.out.println(Arrays.deepToString(result));
    }




































    private static int[][] flipImage(int[][] A){
        for (int i = 0; i < A.length; i++) {
            int j = 0; // current row
            int k = A[i].length - 1; // current column
            // flip the matrix
            while (j < k){
                int temp = A[i][j];
                A[i][j++] = A[i][k];
                A[i][k--] = temp;
            }
            //invert the matrix
            for (j = 0; j < A[i].length; j++){
                if (A[i][j] == 1){
                    A[i][j] = 0;
                }else {
                    A[i][j] = 1;
                }
            }
        }
        return A;
    }
}
