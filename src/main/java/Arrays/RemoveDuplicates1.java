package Arrays;

public class RemoveDuplicates1 {

    /*GIven array with consecutive duplicates, remove the duplicates and return the array.*/
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,4,5,5,5,6,7};
        int [] arr2 = new int[arr.length];
        int countZero = 0;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr2[i] = arr[i];
            }
            if(i+1 == arr.length-1){
                arr2[i+1] = arr[i+1];
            }
        }

       /* for(int num: arr2){
            System.out.println(num);
        }*/

        for(int num: arr2){
            if(num == 0){
                countZero++;
            }
        }

        //to remove zeroes

        int[] arrWithoutZero = new int[arr2.length - countZero];

        for(int i=0, k=0; i< arr2.length || k < arrWithoutZero.length; i++){
            if(arr2[i] != 0){
                arrWithoutZero[k] = arr2[i];
                k++;
            }
        }

        System.out.println("final array is: ");
        for(int num : arrWithoutZero){
            System.out.print(num);
        }


    }
}
