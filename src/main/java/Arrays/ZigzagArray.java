package Arrays;

public class ZigzagArray {

    public static void convertToZigzag(int[] arr) {
        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                // Even index, arr[i] should be less than or equal to arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    // Swap if the condition is violated
                    swap(arr, i, i + 1);
                }
            } else {
                // Odd index, arr[i] should be greater than or equal to arr[i+1]
                if (arr[i] < arr[i + 1]) {
                    // Swap if the condition is violated
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};

        System.out.println("Original Array:");
        printArray(arr);

        convertToZigzag(arr);

        System.out.println("Zigzag Array:");
        printArray(arr);
    }
}