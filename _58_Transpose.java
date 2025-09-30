import java.util.Arrays;

public class _58_Transpose {
    
    public static void transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transpose = new int[cols][rows];  

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Transposed matrix:");
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        transpose(arr);

        
    }
}
