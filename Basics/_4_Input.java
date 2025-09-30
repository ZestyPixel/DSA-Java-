import java.util.Scanner;
public class _4_Input {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        /*sc.next reads until space, sc.nextLine takes the whole thing */

        int num = sc.nextInt();
        System.out.println(num);

        float nums = sc.nextFloat();
        System.out.println(nums);

        boolean boo = sc.nextBoolean();
        System.out.println(boo);

        sc.close();
    }
}
