public class _6_Subarrays {
    public static void printSubarrays(int array[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                int sum = 0;

                for (int p = start; p <= end; p++) {
                    System.out.print(array[p] + " ");
                    sum += array[p];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                System.out.print("Sum = " + sum);
                System.out.println();
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        printSubarrays(numbers);
    }
}
