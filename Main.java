import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take input from user
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize values
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        // Calculate sum, max, min
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = (double) sum / n;

        // Bubble Sort (manual sorting)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + avg);
        System.out.println("Max     : " + max);
        System.out.println("Min     : " + min);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2D Array Example
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\n2D Array:");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        // Exception handling
        try {
            System.out.println(arr[n]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds handled!");
        }

        sc.close();
    }
}
