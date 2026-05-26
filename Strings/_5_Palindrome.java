public class _5_Palindrome {

    public static void checkPalindrome(String s, int left, int right){
        if(left >= right){
            System.out.println("Palindrome");
            return;
        }

        if(s.charAt(left) == s.charAt(right)){
            checkPalindrome(s, left+1, right-1);
        } else{
            System.out.println("Not a Palindrome.");
        }

    }

    public boolean isPalindrome(String s) { //This solution has a worse space complexity cuz replaceall makes a new string.
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); //Replaces every character that is not a digit or a letter.
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;     
    }

    public static boolean Palindrome(String s) { // Best, with constant space complexity.

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "noon";
        checkPalindrome(s, 0, s.length()-1);
    }
}
