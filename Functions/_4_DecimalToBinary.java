import java.util.Scanner;

public class _4_DecimalToBinary {

    public static long decimalToBinary(int decimal) {
        long binary = 0;
        int i = 0;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10, i);
            decimal /= 2;
            i++;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        long result = decimalToBinary(decimal);
        System.out.println("Binary equivalent: " + result);

        scanner.close();
    }
}

