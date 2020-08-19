package z_random;

public class String_Permutations {
    public void main(String[] args) {
        String s = "abc";
        permutation(s);
    }





































    public static void permutation(String str) {
        permutations("", str);
    }

    private static void permutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
            for (int i = 0; i < n; i++)
                permutations(prefix + str.charAt(i),
                        str.substring(0, i) + str.substring(i+1, n));

    }
}
