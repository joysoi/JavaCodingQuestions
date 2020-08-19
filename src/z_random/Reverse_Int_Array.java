package z_random;

import java.util.Arrays;

public class Reverse_Int_Array {
    public void main(String[] args) {
        int[] nums = {1,2,3};
        int[] result = reverseIntArray(nums);
        System.out.println(Arrays.toString(result));

    }



































    private static int[] reverseIntArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
        return nums;
    }
}
