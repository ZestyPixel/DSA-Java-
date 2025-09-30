public class _22_ReverseArrayOptimised {
    public static void reverse(int array[]){
        int first = 0;
        int last = array.length-1;
        while(first<last){
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers []= {1,2,3,4,5};
        reverse(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
