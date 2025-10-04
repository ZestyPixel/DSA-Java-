public class _7_NewKeyword {

    public static void main(String[] args) {
        // Case 1: String literals (interned)
        String a = "hello";
        String b = "hello";

        // Case 2: Using new keyword (heap object)
        String c = new String("hello");

        // == compares references (memory address)
        System.out.println("a == b: " + (a == b)); // true: both point to same interned literal
        System.out.println("a == c: " + (a == c)); // false: 'c' points to a new object in heap

        // .equals() compares actual content
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("a.equals(c): " + a.equals(c)); // true
    }


}
