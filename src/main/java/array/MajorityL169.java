package array;

import java.util.*;

public class MajorityL169 {




    public static void main(String args[]){
int a[]={8,8,7,7,7};
        //System.out.print(majorityElement(a));
        System.out.print("Hashing:" +hashing(a));

    }
    // bruette force -> TC- o(N^2) since multiple loops are runing
    public static  int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count>(n/2)){
                return nums[i];
            }

        }
        return -1;
    }


    // better

    public static int hashing(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ans = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i],ans);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()>(n/2)) {
                return entry.getKey();
            }
        }
        return -1;
    }


}
