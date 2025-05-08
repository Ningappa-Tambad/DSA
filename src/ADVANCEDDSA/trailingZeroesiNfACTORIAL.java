package ADVANCEDDSA;

public class trailingZeroesiNfACTORIAL {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("The number of trailing zeros in " + n + "! is: " + countTrailingZeros(n));
    }

    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
