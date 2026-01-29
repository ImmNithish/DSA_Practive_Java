package array;

import java.util.*;

public class UninonofSortedArray {


    public static void main(String args[]) {
        System.out.print(Arrays.toString(optimal()));

    }

    public static int[] union() {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 6};

        // ans {1,2,3,4,5}
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int n1 : arr1) {
            set1.add(n1); // 1,2,3,4,5
        }
        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }
        int[] union = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            union[i++] = num;
        }

        return union;
    }


    public static int[] optimal() {

        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 6};
        int i = 0;
        int j = 0;

        while (i < j) {
            while (i < arr1.length) {

                if (arr1[i] != arr2[j] && arr1[i - 1] != arr2[j]) {
                    arr1[i + 1] = arr2[j];
                    i++;
                    j++;
                } else {
                    arr1[i + 1] = arr2[j];
                    j++;
                }
            }
        }
        return arr1;
    }



}
