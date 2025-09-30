public class _62_LargestString {
    
    public static void main(String[] args) {
        String [] str = {"Apple", "Mango", "Banana"};
        String largest = str[0];
        for(int i = 1; i<str.length; i++){
            if(str[i].compareTo(largest) >0) largest = str[i];
        }
        System.out.println(largest);
    }
}