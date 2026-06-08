import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args){
        System.out.print("Enter the length of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
