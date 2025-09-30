import java.util.Scanner;

public class _9_TypeCastingConversionPromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ **Implicit Type Conversion (Widening)**
        System.out.println("1️⃣ Implicit Type Conversion (Widening)");
        int intVal = 50;
        double doubleVal = intVal; // ✅ int → double (Automatic)
        System.out.println("int (50) → double: " + doubleVal);

        // 2️⃣ **Explicit Type Casting (Narrowing)**
        System.out.println("\n2️⃣ Explicit Type Casting (Narrowing)");
        double pi = 3.14159;
        int piInt = (int) pi; // ✅ double → int (Manual casting)
        System.out.println("double (3.14159) → int: " + piInt); // Loses decimal part

        // 3️⃣ **Type Promotion in Expressions**
        System.out.println("\n3️⃣ Type Prxomotion in Expressions");
        byte a = 10;
        byte b = 20;
        int sum = a + b; // ✅ byte + byte → promoted to int
        System.out.println("byte (10) + byte (20) → int: " + sum);

        char c = 'A'; // ASCII value: 65
        char d = 'B'; // ASCII value: 66
        System.out.println("'B' - 'A' = " + (d - c)); // ✅ char → promoted to int (66 - 65 = 1)

        // 4️⃣ **Mixing Data Types**
        System.out.println("\n4️⃣ Mixing Data Types (Type Promotion)");
        int num = 100;
        float f = 5.75f;
        float result = num + f; // ✅ int promoted to float
        System.out.println("int (100) + float (5.75) → float: " + result);

        // 5️⃣ **User Input with Type Casting**
        System.out.println("\n5️⃣ User Input & Casting");
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt(); // Takes an integer input

        double castedInput = (double) userInput; // ✅ Manual conversion
        System.out.println("User Input as double: " + castedInput);

        sc.close(); // Close Scanner to avoid warnings
    }
}
