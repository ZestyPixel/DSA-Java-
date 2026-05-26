public class _6_PrintNTimes {
    
    public static void print (int n){
        if(n==0){
            return;
        }
        System.out.println("Umar");
        print(n-1);
    }
    
    public static void main(String[] args) {
        print(6);
    }
}
