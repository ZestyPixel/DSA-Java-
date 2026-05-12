package CollectionsFramework.ArrayList;
import java.util.ArrayList;

public class _2_RemoveDuplicates {
    public static void main(String[] args) {
        //Given an array, remove duplicates and return elements in same order.
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(3);

        ArrayList <Integer> newList = new ArrayList<>();

        for(int i: list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }

        System.out.print(newList);
    }
}
