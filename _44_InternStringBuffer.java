public class _44_InternStringBuffer {
    public static void main(String[] args) {
        String s1 = new String("Apna");
    String s2 = "Apna";
    System.out.println(s1 == s2); // false (different references)

    s1 = s1.intern(); // now s1 refers to the pooled string
    System.out.println(s1 == s2); // true



    StringBuffer sb = new StringBuffer("Hello");
    sb.append(" World");
    System.out.println(sb); // Output: Hello World


    }
}
