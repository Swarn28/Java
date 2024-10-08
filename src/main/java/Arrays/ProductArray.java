package Arrays;
import java.util.Arrays;


/*
* Also known as 'Product of Array Except Self'
* Given an array of integers find
*  the product of all elements on left and right of a particular element and return
* the same in the order of original array.
[3,5,6,9] ---> 270, 172, 135, 90
*
* */
public class ProductArray  {
    public static int[] findProductArray(int[] arr) {
        int n = arr.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] result = new int[n];

        // Initialize leftProduct and rightProduct
        Arrays.fill(leftProduct, 1);
        Arrays.fill(rightProduct, 1);

        // Fill the leftProduct array
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        // Fill the rightProduct array
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * arr[i + 1];
        }

        // Calculate the result by multiplying left and right products
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] result = findProductArray(arr);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
