import java.util.Scanner;

public class questionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the array: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than zero.");
                return;
            }

            int[] arr = new int[n];
            long sum = 0; 
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            // Calculate average
            double average = (double) sum / n;

            // Output results
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
