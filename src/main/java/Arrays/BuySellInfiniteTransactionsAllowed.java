package Arrays;


/*
* We try to find localMinima and LocalMaxima and keep adding their results.
* https://www.geeksforgeeks.org/stock-buy-sell/?ref=ml_lbp
*
* */
public class BuySellInfiniteTransactionsAllowed {

    public static void main(String[] args) {
        int [] arr = {100, 180, 260, 310, 40, 535, 695};
        int n = arr.length -1;
        int i = 0;
        int lMin, lMax,result = 0;
        while(i<n){

            while(i<n && arr[i] >= arr[i+1]){
                i++;
            }
            lMin = arr[i];

            while(i<n && arr[i] <= arr[i+1]){
                i++;
            }
            lMax = arr[i];

            result = result + lMax - lMin;

        }

        System.out.println("Result is : " +result);

    }
}
