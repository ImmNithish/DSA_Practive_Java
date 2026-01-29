package array;

import java.util.*;

public class addTwo {


    public static void main(String args[]) {
        int num[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(num, 9)));
        System.out.println(Arrays.toString(hashing(num, 9)));
    }

    // Brutte force approach
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }

    // optimal aprroach hashing

    public static int[] hashing(int[] num, int target) {
        int n = num.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n;i++){
            int answer = target-num[i];
            if(map.containsKey(answer)){
                return new int[] { map.get(answer),i};
            }
                map.put(num[i],i);

        }
        return  new int[]{};

    }
}


