public class _15_CountDigits {
    
    public static int method1(int num){
        int count = 0;

        if(num == 0){
            return 1;
        }

        if(num<0){ //To handle negative numbers.
            num *=-1;
        }

        while(num>0){
            count++;
            num = num/10;
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(method1(-765));
        //Another way to get digit count
        int count = (int) Math.log10(765) + 1;
        System.out.println(count);
    }
}
