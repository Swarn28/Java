package Arrays;

import java.util.HashSet;

public class TwoSumUnsorted {

    public static void main(String[] args) {
        int[] arr = {8,2,10,5};
        int target = 18;
        int diff=0;

        HashSet<Integer> numSet = new HashSet<>();

        for(int num: arr){
            numSet.add(num);
            diff = target - num;

            if(numSet.contains(diff)){
                System.out.println("Numbers are : " +num +",  " +diff);
            }
        }

        System.out.println("not found..");

    }
}
