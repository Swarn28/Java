package Sorting;

public class QuickSort {

   public int[] quickSort(int low, int high, int[] arr){
       int pivot = arr[high];
       int lp= low;
       int rp = high;

       if(lp>=rp){
           return arr;
       }

       while(lp<rp) {
           while (arr[lp] <= pivot && lp < rp) {
               lp++;
           }
           while (arr[rp] >= pivot && lp < rp) {
               rp--;
           }
           swap(lp, rp, arr);
       }
        swap(rp, high,arr);
        quickSort(low, rp-1,arr);
        quickSort(rp+1,high,arr);
       return arr;
   }

   public void swap(int a, int b, int[] arr){
       int temp;
       temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
   }

    public static void main(String[] args) {
        int[] arr = {4,1,9,2,7,5};

        int low =0 ;
        int high = arr.length-1;
        QuickSort qs = new QuickSort();
        int[] sorted = qs.quickSort(low,high,arr);

        System.out.println("Sorted Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(sorted[i]);
        }
    }

}
