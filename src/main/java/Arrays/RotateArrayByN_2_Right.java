package Arrays;

import java.util.Arrays;

public class RotateArrayByN_2_Right {

    /*
    * It can be a rotate right by K or it could be rotate left by K. Both will be different.
    *
    * For Rotate right:
    *   step 1-> Reverse last K elements. Do this using the same array. Take 2 pointers i and j
    *   Step 2-> Reverse first n-k elements
    *   Step 3-> Now reverse the whole array all together.
    *
    * For Rotate left:
    *   Step 1-> Reverse First K elements.
    *   Step 2 -> Reverse last n-k elements.
    *   Step 3 -> Reverse the whole array.
    *
    * */

    public static void main(String[] args) {
       // int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {-1,-100,3,99};
        //int[] newArr = new int[arr.length];
        int n = arr.length;
        int k=2;
        k = k%n;
        //int i = k-1;
       // int j=arr.length-1;
        int i,j=0;

       //From back reverse last k elements.
        for(i=n-k, j = n-1; i<j ; i++,j--){
            swap(i,j,arr);
        }

        System.out.println("First half done...");

        //Reverse first n-k elements
        for(i=0,j=n-k-1; i<j;i++,j--){
            swap(i,j,arr);
        }

        System.out.println("second half done...");
        //Reverse full array...
        for(i=0,j=n-1 ; i<j ; i++,j--){
            swap(i,j,arr);
        }

        System.out.println(" done...");

    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
