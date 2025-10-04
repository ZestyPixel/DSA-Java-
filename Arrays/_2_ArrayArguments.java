public class _2_ArrayArguments {
    public static void update(int array[]){
        for(int i=0;i<array.length;i++){
            array[i] += 1;
        }
    }
    public static void main(String[] args) {
        int array[] = {90,90,90};
        update(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}

//ARRAYS ARE ALWAYS PASS BY REFRENCE
