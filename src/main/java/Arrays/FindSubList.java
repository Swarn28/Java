package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*You are given a master array list and a sub list. You need to find the starting index
of the sublist in the master list and tell whether a sublist consists in the master list.*/
public class FindSubList {

    public static void main(String[] args) {
        List<Integer> masterList =  Arrays.asList(23,45,12,5,12,5,7,1,23,56,23,11,21,23,22,11,46,7,3);
        List<Integer> subList = Arrays.asList(12,5,7,1);
        List<Integer> newList = new ArrayList<>();

        int len = subList.size();
        int matchCount = 0;

        for(int i =0;i<masterList.size();i++){
            if(masterList.get(i) == subList.get(0)){
                newList.add(i);
            }
        }

        for (Integer num : newList){
            matchCount = 0;
            for(int i= num, j=0; i< masterList.size() & j< len ; i++, j++){
                if(masterList.get(i) == subList.get(j)){
                    matchCount ++;
                }
            }
            if(matchCount == len){
                System.out.println("Found at : "+num);
            }
        }

        if(matchCount != len) {
            System.out.println("not found ...");
        }

    }
}
