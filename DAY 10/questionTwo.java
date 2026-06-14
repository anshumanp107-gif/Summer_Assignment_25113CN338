import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=2*m-2*i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
