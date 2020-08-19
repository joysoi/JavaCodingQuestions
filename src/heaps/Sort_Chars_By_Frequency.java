package heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
 Problem description: Given a String, sort it in a decreasing order based on the frequency of the characters.
 Example:
 Input: "tree"
 Output: "eert"

 */
public class Sort_Chars_By_Frequency {
    public void main(String[] args) {
        String s = "tree";
        String result = sortCharsByFrequency(s);
        System.out.println(result);
    }


































    private static String sortCharsByFrequency(String s) {
        StringBuilder builder = new StringBuilder();
        if (s == null && s.length() == 0){
            return builder.toString();
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));


        for (char c : map.keySet()){
            maxHeap.add(c);
        }

        while (!maxHeap.isEmpty()){
            char popChar = maxHeap.remove();
            int count = map.get(popChar);
            for (int i = 0; i < count; i++) {
                builder.append(popChar);
            }
        }
        return builder.toString();
    }
}
