public class _70_SortedArrayRecur {
    
    public static boolean sorted(int[] arr,int i){
        if(i == arr.length-1) return true;
        if(arr[i] < arr[i+1]) return sorted(arr, i+1);
        else return false;
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,5};
        System.out.print(sorted(arr,0));
    }
}
