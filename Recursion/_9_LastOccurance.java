public class _72_LastOccurance {
    
    public static int occur(int[] arr, int key, int i) {
        if (i < 0) return -1;
        if (arr[i] == key) return i;
        return occur(arr, key, i - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 6, 7, 4};
        int loc = occur(arr, 6, arr.length - 1);
        System.out.print(loc);
    }
}
