import java.util.Scanner;
public class _5_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine(); //Consuming the leftover newline character by the enter we pressed when inputting the above integer.
        String num = sc.nextLine();
        System.out.println("Hello" + input + num);
        sc.close();
    }
}
