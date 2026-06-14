import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
