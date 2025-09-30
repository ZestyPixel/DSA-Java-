import java.util.Arrays;
import java.util.Collections;

public class _49_InbuiltSort {
    public static void main(String[] args) {
        int arr [] = {5, 6, 8, 2, 3, 1, 4, 7, 9, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr1 [] = {4, 3, 5, 6, 7, 9, 8, 1, 2};
        Arrays.sort(arr1, 0, 3); //TO SORT ONLY SPECIFIC RANGES, END INDEX IS NOT INCLUSIVE
        System.out.println(Arrays.toString(arr1));
        
        Integer arr2 [] = {4, 3, 5, 6, 7, 9, 8, 1, 2};
        Arrays.sort(arr2, Collections.reverseOrder()); //TO SORT IN DESCENDING ORDER, CAN ALSO USE START AND END INDEX HERE, ONLY WORKS ON OBJECTS
        System.out.println(Arrays.toString(arr2));
        
    }
}
