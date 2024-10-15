package BackTracking;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
* https://www.youtube.com/watch?v=kYY9DotIKlo&list=PLzffTJx5aHaTFf02t0Cr47pamj8KWyFTg&index=27
* */
public class SubSetProblem {

    public static void main(String[] args) {
//Iterativeapproach();
        int[] arr = {1,2,3};
        List<List<Integer>> resultList = new CopyOnWriteArrayList<>();
        backTrackingSubset(0,arr,new ArrayList<>(), resultList);
        System.out.println(resultList);

    }


    private static void backTrackingSubset(int index, int[] arr, List<Integer> curr, List<List<Integer>> resultsList){
        resultsList.add(new ArrayList<>(curr));

        for(int i=index;i<arr.length;i++){
           curr.add(arr[i]);
           backTrackingSubset(i+1, arr,curr,resultsList);
           curr.remove(curr.size()-1);
        }
    }

    private static void Iterativeapproach() {
        int[] arr = {1,2,3};
        List<List<Integer>> resultList = new CopyOnWriteArrayList<>();
        resultList.add(new ArrayList<>());
// THis is using iterative approach...
        int i=0;
        while(i< arr.length) {
            for (List<Integer> list : resultList) {
                    List<Integer> tempList = new ArrayList<>(list);
                    tempList.add(arr[i]);
                    resultList.add(tempList);
            }
            i++;
        }

        System.out.println(resultList);

    }
}


/*
* // Iterate over each element in the array without using CopyOnWriteArrayList
        for (int i = 0; i < arr.length; i++) {
            int size = resultList.size();  // Get current size of resultList (number of subsets so far)

            // For each subset already in resultList, create a new subset that includes arr[i]
            for (int j = 0; j < size; j++) {
                // Create a new subset based on the existing subset at index j
                List<Integer> tempList = new ArrayList<>(resultList.get(j));
                tempList.add(arr[i]);  // Add the current element arr[i] to the new subset
                resultList.add(tempList);  // Add the new subset to resultList
            }
        }
* */