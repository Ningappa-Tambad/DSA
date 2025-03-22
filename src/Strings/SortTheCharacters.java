package Strings;

public class SortTheCharacters {

    static void sort(char[] A)
    {
        //create a frequency array

        int[] freq=new int[26];
        for(int i=0;i<A.length;i++)
        {
            int idx=A[i]-'a';
            freq[idx]++;
        }

        //build ans using freq array

        int k=0;
        for(int i=0;i<26;i++)
        {
            int count=freq[i];
            char ch=(char)(i+'a');


            //ch is present count times
            for(int j=1;j<=count;j++)
            {
                A[k]=ch;
                k++;
            }

            if(k==A.length)
            {
                break;
            }
        }


    }

    public static void main(String[] args) {

        char[] A = {'a', 'z', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

        sort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");

        }
    }
}
