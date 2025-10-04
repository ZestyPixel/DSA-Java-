import java.util.Scanner;
public class _1_Array {
    public static void main(String[] args) {
        int array [] = new int[50];
        // int array2 [] = {1,2,3};
        // String array3 [] = {"Apple","Mangoes","Bananas"};

        Scanner sc = new Scanner(System.in);
        array[0] = sc.nextInt();
        System.out.println(array[0]);

        //For printing length of array

        System.out.println(array.length);
        sc.close();
    }
}
