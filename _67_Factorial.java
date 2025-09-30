public class _67_Factorial {
    
    public static int fact(int n){
        if(n ==0 || n == 1) return 1;
        return n * fact(n-1);
    }
    
    public static void main(String[] args) {
        int x = fact(4);
        System.out.println(x);
    }
}
