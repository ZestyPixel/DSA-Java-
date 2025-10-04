public class _16_CheckPalindrome {
    
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char st = s.charAt(start);
            char ed = s.charAt(end);
            if(!Character.isLetterOrDigit(st)) start++;
            else if(!Character.isLetterOrDigit(ed)) end--;
            else if(Character.toLowerCase(st) == Character.toLowerCase(ed)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: panama";
        System.out.println(isPalindrome(str));
    }
}
