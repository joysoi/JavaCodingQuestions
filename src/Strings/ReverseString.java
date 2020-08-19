package Strings;

/*
Problem description:
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */

public class ReverseString {
    public void main(String[] args) {
        String word = "hello";
        String s = stringReverse(word);
        System.out.println(s);
    }


































    private static String stringReverse(String word) {
        char[] chars = word.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        return new String(chars);
    }
}

