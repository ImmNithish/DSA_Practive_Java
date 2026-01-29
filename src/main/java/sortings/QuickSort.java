package sortings;

public class QuickSort {

public static void pivotPoint(int[] array, int low, int high){

    // consider a pivot point as first index
    int pivot= array[low]; // 5
    int i =low;
    int j = high;

     while(i<j){

         // left side should be elements less than pivot
          while(array[i]<=pivot && i< high){
              i++;
          }

          // right side should be elements higher than pivot
         while(j>=low && array[j] > pivot){
             j--;
         }

         if(i<j){

         }


     }

}



    public static  void main(String [] args ){
        int[] arr={5,7,8,3,2,1};

        int low = 0;
        int high= arr.length-1;
        pivotPoint(arr,low,high);

        // pivot
        //sort

    }
}
