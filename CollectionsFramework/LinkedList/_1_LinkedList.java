package CollectionsFramework.LinkedList;

import java.util.LinkedList;

public class _1_LinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(9);
        System.out.println(list);
        System.out.println(list.get(1));
        list.addFirst(3);
        System.out.println(list.getFirst());
        list.remove(); //removes first element
        list.removeLast();
        list.removeFirstOccurrence(1);
        list.removeIf(x->x%2==0);
    }
}
