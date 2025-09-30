public class _39_StringBuilder {
    public static void main(String[] args) {
        Integer a = 10;
        String str = a.toString();
        System.out.println(str.charAt(0)); //Now able to treat a number as a string, can do it for float double char 
        System.out.println(str.charAt(0) + str.charAt(1)); //Here the nums get converted into unicode values as they are in a arithemetic expression

        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
