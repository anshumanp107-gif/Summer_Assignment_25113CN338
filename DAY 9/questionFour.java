import java.util.Scanner;

public class questionFour {
    public static void main(String[] args) {
        System.out.print("Enter the range of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==m-1||j==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
