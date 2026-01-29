package array;


import java.util.Arrays;

/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/
public class sortColors {

public static void main(String [] args){
    int[]a ={2,0,2,1,1,0};
    System.out.println(Arrays.toString(solution(a)));
}

    public static  int[] solution(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                swap(nums[i],nums[i+1]);
            }
        }
        return  nums;
    }
    public static  void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
    }

}
