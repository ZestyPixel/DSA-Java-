public class _55_DiagonalSum {

    public static void diagonalSum(int[][] arr) {
        int n = arr.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal: top-left to bottom-right
            primarySum += arr[i][i];

            // Secondary diagonal: top-right to bottom-left
            if (i!=arr.length-1-i){
                secondarySum += arr[i][n - 1 - i];

            }
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 8},
            {9, 6, 5, 4}
        };

        diagonalSum(matrix);
    }
}
