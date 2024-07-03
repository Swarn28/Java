package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayIntersection {


    public static void main(String[] args) {
        int[] first = {4,9,5};
        int[] second = {9,4,9,8,4};
        Set<Integer> setInt = new HashSet<>();

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
                setInt.add(num);
            }

            else{
                mapCount.put(num,1);
            }
        }

       // mapCount.forEach((k,v) -> checkEven(k,v));

        setInt.forEach(s-> System.out.println(s));

    }

    public static void  checkEven(Integer key, Integer value){
       if(value ==0 ){
           System.out.println(key);
       }
    }

}
