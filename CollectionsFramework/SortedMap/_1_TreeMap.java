package CollectionsFramework.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class _1_TreeMap {
    public static void main(String[] args) {
        SortedMap <Integer, String> map = new TreeMap<>((a, b)-> b-a); //Descending order
        map.put(94, "Umar");
        map.put(92, "Alakh");
        map.put(95, "Santosh");
        map.put(65, "Rohit");
        map.put(34, "Ravi");
        System.out.println(map);
        System.out.println(map.lastKey());
        System.out.println(map.headMap(92)); //Data less than 92
        System.out.println(map.tailMap(92)); //Data greater than or equal to 92
    }
}
