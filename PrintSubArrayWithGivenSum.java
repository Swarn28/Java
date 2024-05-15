package org.example;

public class PrintSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1,4,0,0,3,10,5};
        int num = 19;
        int i=0, j=0;
        int currSUm = arr[0];
        while(i<arr.length && j<arr.length){

            while(currSUm < num){
                if(j<arr.length-1) {
                    j++;
                    currSUm = currSUm + arr[j];
                }
            }

            while(currSUm > num){
                if(i<arr.length-1) {
                    currSUm = currSUm - arr[i];
                    i++;
                }
            }

            if(currSUm == num){
                System.out.println("Sub array is between " + i + " and " + j);
                return;
            }

        }

        System.out.printf("no subArray found");
    }

}
