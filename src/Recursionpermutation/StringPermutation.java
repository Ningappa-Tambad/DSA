package Recursionpermutation;

public class StringPermutation {

    public static void main(String[] args) {
        permutation("", "abc");
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < up.length(); i++) {

            String f=up.substring(0,i);
            String s=up.substring(i+1);
            permutation(f+ch+s,up.substring(1));



        }
    }
}
