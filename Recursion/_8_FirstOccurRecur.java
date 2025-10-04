public class _8_FirstOccurRecur {

    public static int occur(int [] arr, int key, int index ){
        if(index == arr.length) return -1;
        else if(arr[index] == key) return index;
        else return occur(arr, key, index+1);
    }

    public static void main(String args []){
        int [] arr = {1,2,3,4,5,5,4,3,2,1};
        int key = 3;
        System.out.println(occur(arr,key,0));
    }
}