package Arrays;


/*
*
* Given an array of integers find
*  the product of all elements on left and right of a particular element and return
* the same in the order of original array.
[3,5,6,9] ---> 270, 172, 135, 90
*
* */
public class ProductArray {

    public static void productArray(int[] num){

        int n = num.length;

        //create new arrays to store the results.
        int[] left = new int[n];

        int[] right = new int[n];

        int[] results = new int[n];

        // fill left array
        for(int i =0; i< n; i++){

            left[i] = num[i-1] * left[i-1];

        }

        //fill right array
        for(int i =0; i< n; i++){

            right[i] = num[i+1] * right[i+1];

        }


        //create final array
        for(int i =0; i< n; i++){

            results[i] = left[i] * right[i];

        }

        System.out.println(results);


    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        ProductArray.productArray(arr);
    }
}
