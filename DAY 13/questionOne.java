import java.util.Scanner;
public class questionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while (true) {
            System.out.print("Enter the number of elements in the array: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Size must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Element " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); 
                }
            }
        }
        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
