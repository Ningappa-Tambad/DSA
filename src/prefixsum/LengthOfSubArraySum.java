package prefixsum;

public class LengthOfSubArraySum {

    public static int subarraySum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = Math.max(0, i - arr[i]);
            for (int j = start; j <= i; j++) {
                sum += arr[j];

            }


        }
        return sum;
    }
        public static void main(String[] args) {

            int[] nums = {2, 3, 1};
            int result = subarraySum(nums);
            System.out.println("The sum of the subarray is: " + result);

        }

    }

