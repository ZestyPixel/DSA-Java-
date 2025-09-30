public class _27_MixedArrayKadane {
    public static void main(String[] args) {
        int arr[] = {-2, -3, -4, -1, 2,5,6,-3 };
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Max Subarray Sum = " + maxSum);
    }


}
