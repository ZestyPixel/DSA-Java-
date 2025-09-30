import java.util.Arrays;

public class _52_SelectionDescending {
    
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
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
        int arr [] = {4,5,6,7,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
