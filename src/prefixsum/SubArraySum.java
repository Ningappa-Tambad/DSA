package prefixsum;

public class SubArraySum {

    public static int[] PrefixSum(int[] A) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + A[i];
        }
        return ps;
    }

    public static void subarraySUm(int[] A) {
        int n = A.length;

        int[] ps=PrefixSum(A);

        for(int s=0;s<n;s++)
        {
            for (int e = s; e < n; e++) {
                if (s == 0) {
                    System.out.println("Sum of subarray from " + s + " to " + e + " is " + ps[e]);
                } else {
                    System.out.println("Sum of subarray from " + s + " to " + e + " is " + (ps[e] - ps[s - 1]));
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] A={1,2,3};
        subarraySUm(A);
    }
    }

