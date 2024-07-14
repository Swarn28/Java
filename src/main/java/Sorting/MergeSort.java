package Sorting;


// https://www.youtube.com/watch?v=bOk35XmHPKs&t=319s
public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {44,19,27,11,23,55,21,18};
        arr= mergeSort(arr);

        for(int num: arr){
            System.out.println(num);
        }
    }

    public static int[] mergeSort(int[] arr){

        // iterate the array and break it into leftArray,rightArray.
        // merge the smaller parts in sorted order.
        int len = arr.length;
        int low, high, mid =0;

        mid = len / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[len-mid];

        if(len>=2) {

            for (int i = 0; i < mid; i++) {
                leftArray[i] = arr[i];
                System.out.println("Left array: "+leftArray[i]);
            }

            for (int i = 0; i < len-mid; i++) {
                rightArray[i] = arr[mid+i];
                System.out.println("Right array: "+rightArray[i]);
            }

            mergeSort(leftArray);
            mergeSort(rightArray);
            sortAndJoin(leftArray, rightArray,arr);

        }
        else{
            return arr;
        }

        return arr;
    }

    public static int[] sortAndJoin(int[] leftArray,int[] rightArray, int[] arr){
        /*
        * i is to track leftArray, j is to track rightArray, and k is to keep track of main array.
        * */
        int i=0, j=0,k=0;

        while(i< leftArray.length && j < rightArray.length){

            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /*if i is greater leftArray length. Which means all the elements of leftArray has been
        added to the main array. Now we need to copy all elements of righ array to the main array.*/
        if(i>=leftArray.length){
            for(int m = j; j<rightArray.length ; j++){
                arr[k] = rightArray[j];
                k++;
            }
        }

        if(j>=rightArray.length){
            for(int m = i; i<leftArray.length ; i++){
                arr[k] = leftArray[i];
                k++;
            }
        }

        return arr;
    }

}
