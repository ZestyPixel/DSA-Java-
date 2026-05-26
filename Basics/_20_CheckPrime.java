public class _20_CheckPrime {
    
    public boolean optimalMethod(int n) {
        int cnt = 0;  

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;  // If n is divisible by i, increment the counter

                // If n is not a perfect square, count its reciprocal factor
                if (n / i != i) { //This is like the all divisor one, if the number has a factor smaller than its square root then it will have one that is
// bigger than its square root, here by dividing we are finding out whether that factor is the same one for which we accounted above, if not then we count it.
// Basically if say x is a divisor of n then n/x = y, then y is also a factor of n.
                    cnt++;
                }
            }
        }

        return cnt == 2;
    }
    
    public static boolean checkPrime(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++; 
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime.
        return cnt == 2;
    }

    public static void main(String[] args) {
        int n = 18;
        boolean isPrime = checkPrime(n); 

        if (isPrime) {
            System.out.println("prime number.");
        } else {
            System.out.println("not a prime number.");
        }
    }
}
