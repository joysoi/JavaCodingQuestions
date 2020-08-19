package arrays;
/*
Check if given arrays are increasing or decreasing.
Example:
Input: [1,2,3,4]
Output: true
Example:
Input: [1,3,2]
Output: false
 */
public class IncreaseOrDecreaseArray {
    public void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean result = isMonotonic(nums);
        System.out.println(result);
    }

































    private static boolean isMonotonic(int[] nums){
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i + 1]){
                increasing = false;
            }
            if (nums[i] < nums [i + 1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
