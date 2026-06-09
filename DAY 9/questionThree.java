import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for (int i = 0; i < m; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
