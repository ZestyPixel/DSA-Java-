package Hashing;
import java.util.HashMap;

public class _1_CountFrequency {
    public static void main(String[] args) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int [] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 1, 2, 3, 6, 7};

        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1); //getOrDefault returns the value if it exists or 0 if it does not.z`
        }

        System.out.println(map);
    }
}
