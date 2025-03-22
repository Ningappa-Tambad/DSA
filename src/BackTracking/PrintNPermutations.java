package BackTracking;

public class PrintNPermutations {

    public static void main(String[] args) {

            int[] ar={1,2,3};
            int i=0;
            printNPermutations(ar,i,ar.length);
    }

    static void printNPermutations(int[] ar,int i,int n)
    {
        if(i==n)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            return;
        }

        for(int j=i;j<n;j++)
        {
            swap(ar,i,j);
            printNPermutations(ar,i+1,n);
            swap(ar,i,j);
        }
    }

    static void swap(int[] ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
