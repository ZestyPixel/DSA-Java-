import java.util.Arrays;
public class _2_SelectionSort {
    
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){ //Outer loop so that we can exclude the elements from the start that have already been place in their correct
// position every single time.
            int minimum = i; //Initialisation
            for(int j = i; j<arr.length; j++){ // Loop to find the minimum element's index.
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[minimum]; //Swapping
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr [] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// n^2 since no of iterations are always same in best, average and worst cases.