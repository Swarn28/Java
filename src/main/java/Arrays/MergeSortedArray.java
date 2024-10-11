package Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        /*int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};*/

        int[] arr1 = {4,5,6,0,0,0};
        int[] arr2 = {1,2,3};

        mergeArray(arr1, arr2, 3, 3);
    }

    public static void mergeArray(int[] arr1, int[] arr2, int len1, int len2) {
        int i = len1-1;
        int j = len2-1;
        int k = arr1.length -1;

        while(j>=0){
            if(i >=0 && arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                i--;
                k--;
            }

            else{
                arr1[k] = arr2[j];
                j--;
                k--;
            }

        }
    }
}
