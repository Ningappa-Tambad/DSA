package BackTracking;

public class GenerateNDigitsSubSets {

    public static void main(String[] args) {
        generateNDigitsSubSets(3, 2, "");
    }

    static void generateNDigitsSubSets(int n, int i, String processed)
    {
        if(i==n)
        {
            System.out.println(processed);
            return;
        }

        generateNDigitsSubSets(n, i+1, processed+"0");
        generateNDigitsSubSets(n, i+1, processed+"1");                                                                                                                                                                                                          
    }
}
