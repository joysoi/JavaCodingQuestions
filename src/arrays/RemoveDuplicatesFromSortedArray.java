package arrays;

/*
Problem description: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

 */
public class RemoveDuplicatesFromSortedArray {
    public void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicatesAndReturnLength(nums);
        System.out.println(result);
    }


































    private static int removeDuplicatesAndReturnLength(int[] nums) {
        int size = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}
