package Arrays;

/*
* This returns the subarray with given sum from an array.
*
* */
public class PrintSubArrayWithGivenSum {

    public static void main(String[] args) {
        //int[] arr = {1,4,0,0,3,10,5};
        int[] arr = {1,4,20,3,10,5};
        int num = 28;
        int i=0, j=1;
        int currSUm = arr[0];
        boolean keepRunning = true;
        while(keepRunning){

            if (currSUm < num){
                if(j>=arr.length) {
                    System.out.println("not found... ");
                    return;
                }
                currSUm = currSUm + arr[j];
                j++;
            }

            else if(currSUm > num){
                    currSUm = currSUm - arr[i];
                    i++;
            }

            else if(currSUm == num){
                keepRunning = false;
                System.out.println("Sub array is between " + i + " and " + (j-1));
                return;
            }

        }
    }

}
