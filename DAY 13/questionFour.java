import java.util.Scanner;

public class questionFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than zero.");
                return;
            }

            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = sc.nextInt();
            }
            int evenCount = 0, oddCount = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Number of even elements: " + evenCount);
            System.out.println("Number of odd elements: " + oddCount);
    
        
    }
}
