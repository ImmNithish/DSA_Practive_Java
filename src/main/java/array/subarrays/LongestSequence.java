package array.subarrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {


    public static void main(String[] args) {
        int a[] = {100, 4, 200, 1, 3, 2};
        System.out.print("LongestSequence is :" +sequence(a));

    }

    public static int sequence(int a[]) {
        int count = 0;
        int longestCount = 0;
        int n = a.length;
        
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int currentnum = i;
                count=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    count++;
                }
                longestCount=Math.max(longestCount, count);

            }
        }
        return  longestCount;

    }
}
