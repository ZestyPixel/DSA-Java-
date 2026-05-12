package CollectionsFramework.HashSet;
import java.util.HashSet;

public class _1_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(4);
        System.out.println(hash);
        System.out.println(hash.contains(1));
    }
}
