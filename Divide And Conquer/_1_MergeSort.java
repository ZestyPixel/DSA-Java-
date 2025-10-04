public class _1_MergeSort {
    
    public static void printArr(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int [] arr, int start, int end){
        if(start>=end){
            return;
        }
        
        int mid = start + (end - start)/2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }

    public static void merge(int [] arr, int start, int mid, int end){
        int [] temp = new int[end-start+1];
        int i = start; //left
        int j = mid+1; //right
        int k = 0; //for temp array

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(int h = 0, o = start; h<temp.length; h++, o++){
            arr[o] = temp[h];
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8,1};    
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
