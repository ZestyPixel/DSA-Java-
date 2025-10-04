import java.util.Arrays;

public class _3_InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Shift elements greater than 'curr' to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert 'curr' at its correct position
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 3, 1, 2, 4, 7, 8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
