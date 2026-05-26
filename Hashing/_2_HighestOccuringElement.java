package Hashing;

import java.util.HashMap;

public class _2_HighestOccuringElement {

    public static void Frequency(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = n;
        int maxEle = 0; 
        int minEle = 0;

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        Frequency(arr, arr.length);
    }
}
