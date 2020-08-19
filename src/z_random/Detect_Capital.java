package z_random;
/*
Detect right Capital letter usage:
Example 1:
Input: USA
Output: true

Example 2:
Input: leetcode
Output: false

Example 3:
Input: Nikola
Output: true

Example 4:
Input: FlAg
Output: false

 */
public class Detect_Capital {
    public void main(String[] args) {
        String s = "USA";
        boolean result = detectRightCapital(s);
        System.out.println(result);
    }




























    private static boolean detectRightCapital(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                // count how many UpperCase letters we have in the String
                count++;
            }
        }
        return
               // check if they are all UpperCase letters in the String length:
                count == s.length() ||
                        // check if there are no UpperCase Letters
                        count == 0 ||
                        // check if there is only ONE UpperCase Letter
                        count == 1 &&
                                // and check if that UpperCase Letter is the first in the String
                                Character.isUpperCase(s.charAt(0));
    }
}
