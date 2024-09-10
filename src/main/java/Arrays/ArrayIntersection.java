package Arrays;

import java.util.*;

/*
*
* This code is used to find intersection of the 2 arrays.
*
* */
public class ArrayIntersection {


    public static void main(String[] args) {
        int[] first = {4,9,9,5};
        int[] second = {9,4,9,8,4,5,6};

        // Set can be used if we want to remove duplicates from the output.
        Set<Integer> setInt = new HashSet<>();
        List<Integer> listInt = new ArrayList<>();

        Map<Integer, Integer> mapCount = new HashMap<>();

        for(Integer num: first){
            if(mapCount.containsKey(num)){
                mapCount.put(num,mapCount.get(num)+1);
            }

            else{
                mapCount.put(num,1);
            }
        }

        for(Integer num: second){
            if(mapCount.containsKey(num)){
                mapCount.put(num,mapCount.get(num)-1);
                listInt.add(num);
            }

            else{
                mapCount.put(num,1);
            }
        }

       // mapCount.forEach((k,v) -> checkEven(k,v));

        listInt.forEach(s-> System.out.println(s));

    }

    public static void  checkEven(Integer key, Integer value){
       if(value ==0 ){
           System.out.println(key);
       }
    }

}
