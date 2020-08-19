package z_random;

import java.util.HashMap;

/*
Problem description: Given a non-empty array of integers,
every element appears three times except for one,
which appears exactly once. Find that single one.

Extra points:
Note: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example 1:
Input: [2,2,3,2]
Output: 3

Example 2:
Input: [0,1,0,1,0,1,99]
Output: 99
 */
public class Single_Number {
    public void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        int result = singleNumber(nums);
        System.out.println(result);
    }



























    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        for (int i : map.keySet()){
            if (map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}
