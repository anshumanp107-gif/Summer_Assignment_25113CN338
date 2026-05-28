import java.util.Scanner;

public class questionOne{
    public static void main(String[] args) {
        //Write a program to Calculate sum of first N natural numbers.
        System.out.print("Enter the number :");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.out.print("Sum of Natural number upto "+m+" is "+sumN(m));
    }
    public static int sumN(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            count=count+i;
        }
        return count;
    }
}