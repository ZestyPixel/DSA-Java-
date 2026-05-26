public class _17_GCD {
    
    public static void bruteForce(int num1, int num2){
        int n = num1 < num2 ? num1: num2;
        int gcd = 1;
        for(int i = 1; i<=n; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void betterApproach(int num1, int num2){ //Start from the minimum of the two numbers down to one to cut down the no of iterations.
        int n = num1 < num2 ? num1: num2;
        int gcd = 1;
        for(int i = n; i>0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break; //Since we want the greatest one, so we stop at the first common divisor.
            }
        }
        System.out.println(gcd);
    }

    public static void optimalApproach( int num1, int num2){ //Euclidean Algorithm: Repeatedly subtract the smaller of the two numbers until one of them
// becomes 0, then the other number will be the GCD.
// This will have 0(max(a, b)) time complexity in the worst case since the worst case is (1000, 1) where it will take 1000 iterations.
        while(num1 > 0 && num2 > 0){
            if(num1 > num2){
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }
        }
        if(num1 > 0){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;

        bruteForce(num1, num2);
        betterApproach(num1, num2);
        optimalApproach(num1, num2);
    }
}
