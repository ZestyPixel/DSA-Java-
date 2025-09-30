public class _6_TypeConversion {
    public static void main(String[]args){
        int a = 25;
        long b = a;
        System.out.println(b);

        /*You cannot do the reverse as the size of long is bigger than int*/
        /*You can also convert int to float but not vice versa */

        char ch = 'a';
        int c = ch;
        System.out.println(c);
    }
}
