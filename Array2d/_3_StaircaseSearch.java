public class _3_StaircaseSearch {

    public static void stairCase(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1; // ❗ start from the **top-right corner**

        while (row < arr.length && col >= 0) { 
            if (arr[row][col] == key) {
                System.out.println("The key is at " + row + "," + col);
                return;
            } else if (key < arr[row][col]) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        System.out.println("Key not found.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;
        stairCase(matrix, key);
    }
}
