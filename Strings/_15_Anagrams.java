import java.util.Arrays;

public class _15_Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            System.out.println("Sorted arr1:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not anagrams");
            }
        }
    }
}
