import java.util.*;
public class questionTwo {
    public static void main(String[] args){
        //Write a program to Reverse a number. 
        System.out.print("Enter the number : ");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.out.print("The reverse of "+m+ " is "+rev(m));
    }
    public static int rev(int n){
        int r=0;
        int count=0;
        while(n!=0){
            r=n%10;
            count=count*10+r;
            n=n/10;
        }
        return count;
    }
}
