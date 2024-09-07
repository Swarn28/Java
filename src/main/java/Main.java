import ChildParent.ChildTwo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main  {

    public static void main(String[] args) {
        ChildTwo c1 = new ChildTwo(1,"Swarn");
        ChildTwo c2 = new ChildTwo(1,"Swarn");

        Set<ChildTwo> setChild = new HashSet<>();

        setChild.add(c1);
        setChild.add(c2);

        System.out.println("size of set is : "+setChild.size());
    }
}