package arrays;
/*
Problem description: Given n non-negative integers a1, a2, ..., an ,
where each represents a point at coordinate (i, ai). n vertical lines are
drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {
    public void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(nums);
        System.out.println(result);
    }































    private static int maxArea(int[] height) {
        int maxArea = Integer.MAX_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j){
            int min = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, min * (j - i));
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }
}
