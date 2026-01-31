package array.subarrays;

public class maxSubArray {


    public static void main(String args[]) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
       // bruetteForce();
        optimal(a);
    }

    public static void bruetteForce() {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prefixsum = 0;
            for (int j = i; j < n; j++) {
                prefixsum += a[j];
                if (prefixsum > max) {
                    max = prefixsum;
                    start = i;
                    end = j;
                }

            }
        }
        System.out.println(" Maxmium sub array is : " + max);
        System.out.print("Max Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }

    }

    /* Use Kadane’s Algorithm when the problem says:

 🔹 Find maximum sum subarray
 🔹 Largest contiguous subarray sum
 🔹 Maximum subarray problem

     Typical Problem Statements:

     Find the maximum sum of a contiguous subarray

     Return the largest subarray sum

     Print the subarray with maximum sum

     Maximum profit / gain in a sequence (converted to difference array)*/
    public static void optimal(int a[]) {
        //
        int prefixSum = 0;
        int max = Integer.MIN_VALUE;
        int n = a.length;

        int start = 0;
        int end = 0;
        int finalStart=0;
        for (int i = 0; i < n; i++) {
// becuase as per the algo we also keep the sum =0 if the previous sum is negative then the sub array start from there
            // so  we start is like temp
            if(prefixSum==0){
                start=i;
            }
            prefixSum += a[i];
            if (prefixSum > max) {
                max = prefixSum;
                finalStart=start; // since start wont change unless the prefixsum>max so i keep on increment
                // so we assign he i to end
                end=i; //
            }
            if (prefixSum < 0) {
                prefixSum = 0;
            }
        }

        System.out.println(" Maximum sub Array is :" +max);
        System.out.println(" Sub Array is ");
        for(int i=finalStart;i<=end;i++){
            System.out.print(a[i] + " ");
        }

    }
}
