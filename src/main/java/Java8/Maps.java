package Java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {
           /*Hash map usages
        https://chatgpt.com/share/e58fd3a1-8769-4f40-add3-e1163dfe3202  */
        HashMap<String, String> newMap = new HashMap<>();

        newMap.put("A","A");
        newMap.put("B","B");
        newMap.put("C","C");

        newMap.forEach((k,v) ->{
            System.out.println("Key is: " +k);
            System.out.println("Value is: " +v);
        });

        List<String> b = newMap.values().stream().filter(
                v -> v.equalsIgnoreCase("B")).collect(Collectors.toList());

        // From one map create a new map, copy the keys which have values as B to the new hashMap.
        Map<String, String> b1 = newMap.entrySet().stream().filter(
                        v -> v.getValue().equalsIgnoreCase("B")).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        b1.forEach((k,v) -> System.out.println(k + ", " +v));
    }
}
