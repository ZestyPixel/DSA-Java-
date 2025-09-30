public class _72_PowerRecur {

    public static double myPow(double x, int n) {
        if (n == 0) return 1;

        if (n == Integer.MIN_VALUE) return myPow(x, n + 1) / x;

        if (n < 0) return 1 / myPow(x, -n);

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double num = 5;
        int pow = -4;
        double ans = myPow(num, pow);
        System.out.println(ans); 
    }
}
