public class _2_QuickSort {
    
    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei) return; //Base Case

        int pivotIndex = partition(arr,si,ei); //Toofind the pivot index so that we can partition

        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);

    }

    public static int partition(int [] arr, int si, int ei){
        int i = si-1; //So that when we swap, the elements start lining up from the beginning of the array
        int pivot = arr[ei]; //Last element selected as pivot

        for(int j = si; j<ei; j++){ //Swap whenever the element is smaller than the pivot element
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i]; //To put the pivot element into its place which results in it having elements smaller than it on its left and the greater ones on its right.
         arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }
    
    public static void main(String args[]){
        int [] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
