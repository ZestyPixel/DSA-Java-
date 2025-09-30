public class _65_RecurDecreasing {
    public static void recur(int n){
        System.out.println(n);
        if(n==0) return;
        recur(n-1);
    }

    public static void main(String args []){
        recur(5);
    }
}
