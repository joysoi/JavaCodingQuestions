package z_random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer {

    public static void main(String[] args) {
        int area = 12;
        int[] result = answer(area);
        System.out.println(Arrays.toString(result));
    }

    public static int maxSquare(int number, int start, int end) {
        int mid = (start + end) / 2;
        int mid2 = mid * mid;

        if (end - start == 1 || start - end == 1) {
            if ((mid + 1) * (mid + 1) <= number)
                return (mid + 1) * (mid + 1);
            else
                return mid2;
        } else {
            if (mid2 < number)
                return maxSquare(number, mid, end);
            else if (mid2 > number)
                return maxSquare(number, start, mid);
            else {
                return mid2;
            }
        }
    }

    public static int[] answer(int area) {

        // Your code goes here.
        List<Integer> result = new ArrayList<Integer>();
        if (area < 0){
            area *= -1;
        }
        while (area > 0) {
            int next = maxSquare(area, 1, 1000);
            result.add(next);
            area -= next;
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = result.get(i);

        return answer;

    }

    //    private static int getBiggestSquare(int area) {
//        return (int) Math.sqrt(area);
//    }
//
//
//    private static int getBiggestSquare(int number) {
//        int n = 1;
//        while (n * n < number + 1){
//            n += 1;
//        }
//        return n - 1;
//    }
}
