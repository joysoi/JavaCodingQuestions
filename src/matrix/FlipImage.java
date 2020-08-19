package matrix;

import java.util.Arrays;

/*
Flipping an Image.
 */
public class FlipImage {
    public void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flipImage(image);
        System.out.println(Arrays.deepToString(result));
    }




































    private static int[][] flipImage(int[][] A){
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int k = A.length - 1;
            // reversed the array
            while (j < k){
                int temp = A[i][j];
                A[i][j++] = A[i][k];
                A[i][k--] = temp;
            }
            //flipped 1 to 0 and vise versa
            for (j = 0; j < A.length; j++){
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
