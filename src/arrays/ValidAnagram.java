package arrays;

/*
Problem description: Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

 */

public class ValidAnagram {
    public void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean b = isValidAnagram(s, t);
        System.out.println(b);
    }



































    private static boolean isValidAnagram(String s, String t) {
        // int array that stands for all the letters in the alphabet (lowercase)
        int[] count = new int[26];
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            //for s String, every time we see an A we increment, we do the same for all letters
            count[s.charAt(i) - 'a']++;
            //for t String, every time we see an A we decrement, we do the same for all letters
            count[t.charAt(i) - 'a']--;
        }

        // if the total array count contains 0, then the Strings are anagrams
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
