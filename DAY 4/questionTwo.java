import java.util.*;
public class questionTwo {
    public static void main(String[] args){
        //Write a program to Find nth Fibonacci term.
        System.out.print("Enter the nth value:");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        fibb(m);
    }
    public static void fibb(int n){
        int x=1;
        int y=2;
        for(int i=0;i<n-2;i++){
            int t=x;
            x=y;
            y=t+y;
        }
        System.out.print(y);
    }
}
