import java.util.Scanner;
public class _14_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int choice;
        System.out.print("Enter first number: ");
        a = sc.nextInt(); 
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \nEnter your choice : ");
        choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println(a+b);
                    break;
            case 12: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: System.out.println(a/b);
                    break;
            default: System.out.println("Invalid Input");
        }
        sc.close();
    }
}
