public class _10_UnaryOp {
    public static void main(String[] args) {
        int a = 5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        //Here the value of a is assigned to b before increment
        int b = a++;
        System.out.println(b);
        System.out.println(a);
    }
}
