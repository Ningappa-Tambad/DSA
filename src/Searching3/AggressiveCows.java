package Searching3;

import java.security.Key;
import java.util.Arrays;

public class AggressiveCows
{

    static boolean isPossibleToPlaceAllCowsWithGiveDistance(int[] A,int dist,int k)
    {
        int cnt=1;
        int i=0;

        for(int j=1;j<A.length;j++)
        {
            if(A[j]-A[i]>=dist)
            {
                cnt++;
                i=j;
            }

            if(cnt==k)
            {
                return true;
            }
        }
        return false;
    }

    static int aggressiveCows(int[] A,int k)
    {
        int n=A.length;

        Arrays.sort(A);

        int lo=1,hi=A[n-1]-A[0];

        int ans=0;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(isPossibleToPlaceAllCowsWithGiveDistance(A,mid,k)==true)
            {
                ans=mid;
                lo=mid+1;
            }
            else {

                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] A={2,6,11,14,19,25,30,39,43};
        int k=4;


        System.out.println(aggressiveCows(A,k));
    }
}
