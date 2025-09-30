public class _66_RecurIncreasing {
    
    public static void recur(int n){
        if(n ==0){
            System.out.println(n);
            return;
        }
        recur(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        recur(5);
    }
}
