package sortings;

public class MergeSort {


    public static void quickSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low == high) {
            return;
        }
        quickSort(a, low, mid);
        quickSort(a, mid + 1, high);
        merge(a,low,mid,high);

    }


    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 10, 2, 3,};

        quickSort(arr,0,arr.length-1);

    }

    public static void merge(int[] arr, int low,int mid, int high){

        

    }
}
