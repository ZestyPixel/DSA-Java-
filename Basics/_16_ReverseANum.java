public class _16_ReverseANum {
    
    public static int reverse (int x){
        int result = 0;

        while(x != 0){
            
            if(result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE/10 && x%10 < -8){
                return 0;
            }

             if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && x%10 > 7){
                return 0;
            }

            result *= 10; // We do the ops after the checks as the 10 can also overflow if the num is already too big.
            result += x%10; //We don't need to handle negative values here, Java preserves the sign.
            x /=10;
        }

        return result;
    }
    
    public static void main(String [] args){
        System.out.println(reverse(1463847412));
    }
}
