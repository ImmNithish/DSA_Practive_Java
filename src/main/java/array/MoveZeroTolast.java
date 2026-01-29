package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroTolast {

    // brute force

    public static int [] moveZero() {
        int[] arr = {1, 2, 0, 4, 6, 0, 5, 6};
        ArrayList<Integer> temp = new ArrayList<>();
        int size= arr.length; // 8
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        //System.out.println(temp);
       for(int i=0;i<temp.size();i++){
           arr[i]=temp.get(i);
          // System.out.print(arr[j]);
       }

       for(int i=temp.size();i<arr.length;i++){
           arr[i]=0;
       }
       return arr;
    }


    public static void main(String[] args) {
       System.out.println( Arrays.toString(moveZero()));
    }
}
