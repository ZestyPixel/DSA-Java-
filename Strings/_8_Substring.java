public class _38_Substring {
    
    // Manual substring printing (start to end inclusive)
    public static void printManualSubstring(String str, int start, int end) {
        // Validity check
        if (start < 0 || end >= str.length() || start > end) {
            System.out.println("Invalid indexes for manual method");
            return;
        }

        System.out.print("Manual substring: ");
        for (int i = start; i <= end; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // Using built-in substring method (start inclusive, end exclusive)
    public static void printBuiltInSubstring(String str, int start, int end) {
        // Validity check
        if (start < 0 || end > str.length() || start >= end) {
            System.out.println("Invalid indexes for built-in method");
            return;
        }

        String result = str.substring(start, end);  // end is exclusive
        System.out.println("Built-in substring: " + result);
    }

    public static void main(String[] args) {
        String text = "substring";

        // Example 1: print "stri" using both methods (indexes 3 to 6)
        System.out.println("From index 3 to 6:");
        printManualSubstring(text, 3, 6);        // prints: stri
        printBuiltInSubstring(text, 3, 7);       // prints: stri

        // Example 2: print entire string
        System.out.println("\nEntire string:");
        printManualSubstring(text, 0, text.length() - 1);
        printBuiltInSubstring(text, 0, text.length());

        // Example 3: invalid case
        System.out.println("\nInvalid case:");
        printManualSubstring(text, 6, 3);
        printBuiltInSubstring(text, 6, 3);
    }


}
