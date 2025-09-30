public class _23_ArrayPairs {
    public static void pairs(int array[]){
        for(int i = 0; i<array.length; i++){
            int curr = array[i];
            for(int j = i+1; j<array.length; j++){
                System.out.print("(" + curr + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9,0};
        pairs(numbers);
    }
}
