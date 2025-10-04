public class _1_SpiralMatrix {

    public static void spiralMatrix(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }

            // Left column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }

            // Move to the inner layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        spiralMatrix(matrix);
    }
}
