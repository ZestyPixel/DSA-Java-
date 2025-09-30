public class _81_TowerOfHanoi {
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Steps to solve Towers of Hanoi with " + n + " disks:");
        solveHanoi(n, 'A', 'B', 'C'); // A = source, B = auxiliary, C = destination
    }
}
