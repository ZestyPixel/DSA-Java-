public class _4_SumRecur {
    public static int sum(int n){
        if(n == 0){
            return n;
        }

        int previousSum = sum(n-1);

        return n + (previousSum);
    }
    public static void main (String args []){
        System.out.println(sum(5));
    }
}
