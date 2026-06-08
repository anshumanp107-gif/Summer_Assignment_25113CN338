import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args){
        System.out.print("Enter the length of the pyramid:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        for(int i=0;i<=m;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
