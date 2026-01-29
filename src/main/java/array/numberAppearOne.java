package array;
import java.util.HashMap;
import java.util.Map;

// find the number that appear once  and other twice
public class numberAppearOne {

    public static void main(String args[]) {
        int a[] = {1, 1, 2, 3, 3};
        System.out.println("the number appear once is :" + result(a));
        System.out.println("Hashing the number appear once is :" + betterMethod(a));
        System.out.print("XOR  the number appear once is :" + xorMethod(a));
    }

// TC is O[n*n]
    // sc; O[1] since no space is used
    public static int result(int [] a) {

        int num = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            num = a[i]; //1
            for (int j = 0; j < a.length; j++) {
                if (a[j] == num) {
                    count++; //2
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return num;
    }

    public static int betterMethod(int[] a){

        HashMap<Integer, Integer> map = new  HashMap<>();

        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> map1: map.entrySet()){
           if( map1.getValue()==1){
               return map1.getKey();
           }
        }
        return -1;

    }



    public static int xorMethod(int[] a){

        int xor=0;

        for(int num : a){
            xor=xor^num; // 1
        }
        return  xor;
    }
}
