import java.util.Arrays;
public class _47_SelectionSort {
    
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i; //just to start off
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        int arr [] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
