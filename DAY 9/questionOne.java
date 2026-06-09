
import java.util.Scanner;

public class questionOne {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=m-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
