import java.util.*;

public class _19_AllDivisors{
    
    public static ArrayList <Integer> optimalMethod(int N){
        ArrayList<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);

                // If N / i is different from i, add N / i too. (If d is a divisor of n then n/d is also a divisor of n.)
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> getDivisors (int n){ //Brute force method
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(getDivisors(18));
    }
}