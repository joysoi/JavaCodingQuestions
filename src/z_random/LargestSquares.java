package z_random;

    /*
 Write a function solution(area) that takes as its input a single unit of measure representing the total
 area of solar panels you have (between 1 and 1000000 inclusive) and returns a list of the areas of the
 largest squares you could make out of those panels, starting with the largest squares first.
 So, following the example above, solution(12) would return [9, 1, 1, 1].

Input: 12
Solution.solution(12)
Output:
    9,1,1,1

Input: 15324
Solution.solution(15324)
Output:
    15129,169,25,1
     */

public class LargestSquares {

    public static int[] solution(int area) {
        // Your code goes here.
        int[] array = new int[area];
        int index = 0;
        while (area != 0) {
            int res = getBiggestSquare(area);
            area -= res * res;
            array[area] = res * res;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        int[] resultArray = new int[index];
        System.arraycopy(array, 0, resultArray, 0, index);
        reverseIntArray(resultArray);
        return resultArray;
    }


    public static void reverseIntArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }

    public static int getBiggestSquare(int area) {
        int n = 1;
        while (n * n < area + 1) {
            n += 1;
        }
        return n - 1;
    }

}