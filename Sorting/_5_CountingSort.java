import java.util.Arrays;

public class _50_CountingSort {
    
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int count [] = new int[largest + 1];

        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr [] = {5,5,6,3,1,1,1,4,7,8,0};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
