public class _20_ReverseAnArray {
    
    public static void reverse (int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        reverse(array, left+1, right-1);
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        reverse(array, 0, array.length-1);
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
