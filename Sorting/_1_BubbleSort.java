import java.util.Arrays;

public class _1_BubbleSort {

    public static void BubbleSort(int [] arr) {
        for(int i = 0; i<arr.length; i++){ //Outer loop to keep track of how many iterations have been done.
            boolean swap = false; // To check if the array is already sorted.
            for(int j = 0; j<arr.length-1-i; j++){ //Comparison and swap loop. i is subtracted cuz in each iteration elements from the last are sorted,
// also -1 so that we do not have index out of bound error which will happend if we let the loop reach the last element and it compares with j+1.
                if(arr [j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true; // This means that a swap took place thus unsorted array.
                }
            }
            if(!swap){
                break; // If swap is false, then no swap took place and array is sorted so we don't need to do further iterations.
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
