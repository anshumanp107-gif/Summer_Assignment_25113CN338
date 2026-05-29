import java.util.*;
public class questionOne{
    public static void main(String[] args) {
        //Write a program to Find sum of digits of a number. 
        System.out.print("Enter the number : ");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.err.print("The sum of the digits is : "+sum(m));
    }
    public static int sum(int n){
        int count=0;
        int r=0;
        while(n!=0){
            r=n%10;
            count=count+r;
            n=n/10;
        }
        return count;
    }
}