public class _46_BubbleSort {

    public static void BubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println(swap);
            if (swap == 0 && turn == 0) {
                System.out.println("The array is already sorted.");
                break;
            } 
            else if (swap == 0) {
                break; // For if array is sorted mid-way
            }
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        BubbleSort(arr);
    }
}
