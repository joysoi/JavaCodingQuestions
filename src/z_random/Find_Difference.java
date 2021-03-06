package z_random;

import java.util.HashMap;

/*
Problem description: Given two strings s and t which consist of only
lowercase letters.
String t is generated by random shuffling string s and then add
one more letter at a random position.

Find the letter that was added in t.

Example:
Input:
s = "abcd"
t = "abcde"
Output:
e

Explanation:
'e' is the letter that was added.

 */
public class Find_Difference {
        public void main(String[] args) {
            String s = "abc";
            String t = "abcd";
            char result = findTheDifference(s, t);
            System.out.println(result);
        }


























        private static char findTheDifference(String s, String t){
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : t.toCharArray()){
                if (!map.containsKey(c)){
                    return c;
                }else {
                    map.put(c, 1);
                }
            }
            return '!';
        }
    }

    //solution 2:
//    private static char findTheDifference(String s, String t) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        if (s.length() == 0 || t.length() == 0) return '!';
//
//        for (char c : s.toCharArray()){
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : t.toCharArray()){
//            if (map.containsKey(c)){
//                map.remove(c);
//            }else {
//                map.put(c, map.get(c));
//            }
//        }
//
//        for (char c : map.keySet()){
//            return c;
//        }
//        return '!';
//    }


