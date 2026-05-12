package CollectionsFramework.HashMap;

import java.util.HashMap;

public class _1_HashMap {
    public static void main(String[] args) {
       HashMap <Integer, String> map = new HashMap<>();
       map.put(1, "Umar");
       map.put(2, "John");
       System.out.println(map); 
       System.out.println(map.get(1));
       for(int i: map.keySet()){
        System.out.println(map.get(i));
       }
       for(String i: map.values()){
        System.out.println(i);
       }
       for(HashMap.Entry<Integer, String> i: map.entrySet()){
        System.out.println(i.getKey() + " " + i.getValue());
       }
    }
}
