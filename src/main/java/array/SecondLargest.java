package array;

public class SecondLargest {
    /*  Brute force approach -> it T.C O[2]
     * since we are traversing array two times
     * */


    public static void brutteForce(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        System.out.println("largest element is :" + max1);
        for (int a : arr) {
            if (max1 != a && a > max2) {
                max2 = a;
            }
        }

        System.out.println("largest element is :" + max2);
    }

    /**
     * Optimal solution is O[N] since traversing takes place 1 time
     *
     *
     */

    public static void optimalSolution(int a[]) {
        // if all the elements are positive in array  we can take 0 as
        // smallest if it has negative number then user Integer.MIN_VALUE
        int first_largest = 0;
        int second_largest = Integer.MIN_VALUE;

        for (int n : a) {
            if (n > first_largest) {
                second_largest = first_largest;
                first_largest = n;
            } else if (first_largest != n && n > second_largest) {
                second_largest = n;
            }
        }
        System.out.println("First largest ele in array is :" + first_largest);
        System.out.println("Second largest ele in array is :" + second_largest);
    }

    public static void thirdSmallest(int[] a) {
        if (a.length < 2) {
            return;
        }
        int first_smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int third_smallest = Integer.MAX_VALUE;
        for (int n : a) {
            if (n < first_smallest) {
                third_smallest = second_smallest;
                second_smallest = first_smallest;
                first_smallest = n;
            } else if (n != first_smallest && n < second_smallest) {
                third_smallest = second_smallest;
                second_smallest = n;
            } else if (n < third_smallest && n != first_smallest && n != second_smallest) {
                third_smallest = n;
            }
        }
        System.out.println("First smallest element in array : " + first_smallest);
        System.out.println("second smallest element in array : " + second_smallest);
        System.out.println("Third smallest element in array : " + third_smallest);

    }

    /**
     * check the Array is sorted or nor
     */


    public static boolean arrayIsSorted(int[] a) {

        //{1,2,3}
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        //int[] arr={7,8,3,2,0,-1,-1,-2,-2,-1};
        int[] arr = {1, 2, 4};
        //  brutteForce(arr);
        //optimalSolution(arr);
        //thirdSmallest(arr);
        //  arrayIsSorted(arr);
        System.out.println(arrayIsSorted(arr));

    }
}
