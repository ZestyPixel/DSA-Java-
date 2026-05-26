public class _3_Factorial {
    
    public static int fact(int n){
        if(n == 0){
            return 1;
        }

        int previousFact = fact(n-1);

        return n * previousFact;
    }
    
    public static void main(String[] args) {
        int x = fact(4);
        System.out.println(x);
    }
}
