package Strings;

public class StringPermutations {
    public void main(String[] args) {
        String s = "abc";
        int size = s.length();
        permutations(s, 0, size - 1);
    }





































    private static void permutations(String word, int start, int end) {
        if (start == end){
            System.out.println(word);
        }else {
            for (int i = start; i <= end; i++) {
                word = swap(word, start, i);
                permutations(word, start + 1, end);
            }
        }

    }

    private static String swap(String word, int start, int end) {
        char[] chars = word.toCharArray();
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
        return String.valueOf(chars);
    }
}
