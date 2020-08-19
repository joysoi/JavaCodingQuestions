package arrays;
/*
Problem description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false
 */
public class Palindrome {
    public void main(String[] args) {
        String sentence = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(sentence);
        System.out.println(result);
    }































    private static boolean isPalindrome(String word){
        int i = 0;
        int j = word.length() - 1;
        while (i < j){
            while (i < j && !Character.isLetterOrDigit(word.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(word.charAt(j))){
                j--;
            }

            if (i < j && Character.toLowerCase(word.charAt(i++)) != Character.toLowerCase(word.charAt(j--))){
                return false;
            }
        }
        return true;
    }
}
