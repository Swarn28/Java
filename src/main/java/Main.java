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
            int a1;
            List<Integer> list = new ArrayList<>();

            list.add(arr[0]);
            list.add(arr[1]);

        System.out.println(list);
      //  System.out.println(a1);
       // System.out.println(a);
    }
}

@FunctionalInterface
interface A{
    void method1();
}
@FunctionalInterface
interface B{
    void method2();
}

interface C extends A,B{

}