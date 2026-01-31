package array.subarrays;

import java.util.HashMap;

public class subArraySumEqualsTok {

public static void main(String args[]){

    int a[]={1,1,1};
   System.out.println( subarraySum(a,2));
}

    public  static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixsum = 0;
        int subArrayCount=0;
        for (int i = 0; i < n; i++) {
            prefixsum +=nums[i];

            if (map.containsKey(prefixsum-k)){
                subArrayCount += map.get(prefixsum-k);
            }
           map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
        }
        return subArrayCount;

    }
}
