import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=1;i<=m;i++){
            int a=1;
            for(int j=m-i+1;j>=1;j--){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}