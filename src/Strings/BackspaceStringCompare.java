package Strings;

import java.util.Stack;

/*

Problem description: Given two strings S and T,
return if they are equal when both are typed into empty text editors.
# means a backspace character.

Example 1:
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".

Example 4:
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */
public class BackspaceStringCompare {
        public void main(String[] args) {
            String s = "ab#c";
            String t = "ad#c";
            boolean result = backspaceCompare(s, t);
            System.out.println(result);
        }







































        private static boolean backspaceCompare(String S, String T){
            Stack<Character> sStack = new Stack<>();
            for (char c : S.toCharArray()){
                if (c != '#'){
                    sStack.push(c);
                }else if (!sStack.isEmpty()){
                    sStack.pop();
                }
            }

            Stack<Character> tStack = new Stack<>();
            for (char c : T.toCharArray()){
                if (c != '#'){
                    tStack.push(c);
                }else if (!tStack.isEmpty()){
                    tStack.pop();
                }
            }

            //check if the two Stacks are the same
            while (!sStack.isEmpty()){
                char current = sStack.pop();
                if (tStack.isEmpty() || tStack.pop() != current){
                    return false;
                }
            }
            return sStack.isEmpty() && tStack.isEmpty();
        }
}
