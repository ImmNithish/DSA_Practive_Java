package array.subarrays;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.LinkedList;



public class ArrangeElementsBysign {


    public static void main( String[] args ) {
System.out.print(" Answeer is " + Arrays.toString(arrange()));
    }


    public static int[] arrange() {
        int a[] = {3, -2, 1, -5, 2, -4};
        int n = a.length;

        LinkedList<Integer> postive = new LinkedList<>();
        LinkedList<Integer> negative = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                postive.add(a[i]);
            } else {
                negative.add(a[i]);
            }
        }

        // if in the array there are equal postive and negative elemetns then  for (int i = 0; i < negative.size(); i++) {
        //                a[i * 2] = postive.get(i);
        //                a[(i * 2) + 1] = negative.get(i);
        //            } this logice alone need.

        /* suppose if  positive are more in number than negative ot negative or more in numbet than postivie
         add the below logics.
        * */

        if (postive.size() > negative.size()) {
            for (int i = 0; i < negative.size(); i++) {
                a[i * 2] = postive.get(i);
                a[(i * 2) + 1] = negative.get(i);
            }
            int index = negative.size() * 2;
            for (int i = negative.size(); i < postive.size(); i++) {
                a[index] = postive.get(i);
                index++;
            }
        }else {

            for(int i=0;i<postive.size();i++){
                a[i*2]= postive.get(i);
                a[(i*2)+1]= negative.get(i);
        }
            // if some elemetns are left in teh negtive array
            int index= postive.size()*2;
            for(int i=postive.size();i<negative.size();i++){
                a[index]= negative.get(i);
                index++;
            }
    }

return  a;
}
}
