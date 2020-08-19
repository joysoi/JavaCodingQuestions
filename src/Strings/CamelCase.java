package Strings;

public class CamelCase {
    public void main(String[] args) {
        String sentence = "camel case";
        String result = camelCase(sentence);
        System.out.println(result);
    }








































    private static String camelCase(String word){
        if (word.length() == 0){
            return null;
        }
        int space = 0;
        int no_space = 0;
        char[] chars = word.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < word.length(); i++){
            if (chars[i] == ' '){
                space++;
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }else {
                chars[no_space++] = chars[i];
            }
        }

        return String.valueOf(chars, 0, word.length() - space);
    }
}
