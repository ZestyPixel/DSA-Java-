package CollectionsFramework.Comparator;
import java.util.ArrayList;

//We can easily do with lambda expression.

public class _2_StringComparator {
    public static void main(String[] args) {
        ArrayList <String> ar = new ArrayList<>();
        ar.add("banana");
        ar.add("apple");
        ar.add("kiwi");
        ar.add("grapefruit");
        ar.sort((a, b)-> a.length() - b.length());
        System.out.println(ar);
    }
}
