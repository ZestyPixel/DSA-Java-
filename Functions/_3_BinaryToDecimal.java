import java.util.Scanner;

public class _3_BinaryToDecimal {

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int i = 0;

        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, i);
            binary /= 10;
            i++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();

        int result = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + result);

        scanner.close();
    }
}