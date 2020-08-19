package z_random;

import java.util.HashMap;

/*
Problem description: Given a string,
find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.
 */
public class First_Unique_Character_In_String {
    public void main(String[] args) {
        String s = "loveleetcode";
        int result = printFirstUniqueChar(s);
        System.out.println(result);
    }









































    private static int printFirstUniqueChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!hashMap.containsKey(current)) {
                hashMap.put(current, i);
            } else {
                hashMap.put(current, -1);
            }
        }
        System.out.println(hashMap);
        int min = Integer.MAX_VALUE;
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) > -1 && hashMap.get(c) < min) {
                min = hashMap.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

// solution 2:
//private static int printFirstUniqueChar(String s) {
//    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//    for (int i = 0; i < s.length(); i++){
//        char c = s.charAt(i);
//        if (!map.containsKey(c)){
//            map.put(c, i);
//        }else {
//            map.put(c, -1);
//        }
//    }
//    System.out.println(map);
//    int min = Integer.MAX_VALUE;
//    for (char i : map.keySet()){
//        if (map.get(i) > -1 && map.get(i) < min){
//            min = map.get(i);
//            return min;
//        }
//    }
//
//
//    return -1;
//}