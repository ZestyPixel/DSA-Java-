package CollectionsFramework.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class _1_ArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //You can also give initial capacity like new ArrayList<>(10) 
        // to avoid resizing when you know the number of elements in advance.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2, 6); //This shifts elements around and does not replace.
        list.set(2, 50); //This replaces the element in place.
        list.remove(5);//Removes the element at the specified position if you use an index.
        list.remove(Integer.valueOf(1)); //Removes the first occurrence of the specified element. This is necessary to avoid ambiguity with the 
        // remove(int index) method. Integer.valueOf(1) creates an Integer object with the value 1, which allows the remove(Object o) method to be 
        // called instead of remove(int index).
        Collections.sort(list);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(0));
        //Can also use Arrays.asList() to create a list from an array, but it returns a fixed-size list, so you cannot add or remove elements from it.
    }
}