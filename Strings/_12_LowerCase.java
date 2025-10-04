import java.util.Scanner;

public class _12_LowerCase {
    public static void count(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++ ){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);
        sc.close();
    }
}
