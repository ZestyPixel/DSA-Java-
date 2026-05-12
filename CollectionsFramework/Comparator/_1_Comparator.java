package CollectionsFramework.Comparator;

import java.util.Comparator;
import java.util.ArrayList;

class OrderComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer s1, Integer s2){
        return s2-s1;
        // O => equal, positive=> second number will come first, negative => order as it is
    }
}

public class _1_Comparator {
    public static void main(String[] args) {
        ArrayList <Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(5);
        ar.add(4);
        ar.add(3);

        ar.sort(new OrderComparator());
        System.out.println(ar);

        
    }
}
