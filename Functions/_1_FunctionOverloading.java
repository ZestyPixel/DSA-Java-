public class _15_FunctionOverloading {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Multiply 2 integers: " + multiply(4, 5));
        System.out.println("Multiply 3 integers: " + multiply(2, 3, 4));
        System.out.println("Multiply 2 doubles: " + multiply(2.5, 3.2));
    }
}
