package Collections;

import java.util.ArrayList;

public class CollectionLearning {
    public static void main(String[] args) {

        String s = new String();
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(34);
        arrList.add(32);
        arrList.add(56);

        System.out.println("Size of ArralyList: "+arrList.size());

        //Iterators, foreach, streams, advanced for loop. Fail safe and fail fast
       //foreach
        for(int i=0;i<arrList.size();i++){

        }

        //advanced for loop
        for(int ele: arrList){

        }

        // Streams
        arrList.stream().forEach(x -> System.out.println(x));

        //iterator
    }

    // == , equals(obj1, obj2)

}
