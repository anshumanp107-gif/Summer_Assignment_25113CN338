import java.util.*;
public class questionOne{
    public static void main(String[] args){
        //Write a program to Generate Fibonacci series.
        System.out.print("Enter the length of fibbonaci series:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        fib(m);
    }
    public static void fib(int n){
        int x=1;
        int y=2;
        
        System.out.print("1");
        System.out.print(",2");
        for(int i=0;i<n-2;i++){
            int t=x;
            x=y;
            y=x+t;
            System.out.print(","+y);
        }
    }
}