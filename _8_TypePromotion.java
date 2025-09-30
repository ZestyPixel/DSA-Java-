public class _8_TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println(b-a); 
        /*Java will auto promote byte,short or char to int in a expression. Type promotion only happens in expressions. */

        int c = a + b;
        System.out.println(c);

        byte e = 1;
        byte f = 3;
        byte d = (byte) (e+f);
        System.out.println(d);

        int h = 5;
        float k = 6.3f;
        long i = 43;
        double l = 9.0;
        double ans = h + k + i + l; 
        System.out.println(ans);
        /*If an operand is long or float or double, the whole expression will be converted into the biggest one of those*/
    }
}