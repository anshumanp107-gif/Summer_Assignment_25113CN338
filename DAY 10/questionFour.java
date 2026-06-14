import java.util.Scanner;

public class questionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}
