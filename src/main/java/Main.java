import ChildParent.ChildTwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main  {
   // private static int $;

    public static void main(String[] args) {
            int[] arr = {6,9,8};
            String[] strArr = {"a", "b"};
            List<Integer> list = new ArrayList<>();

            list.add(arr[0]);
            list.add(arr[1]);

        System.out.println(list);
    }
}