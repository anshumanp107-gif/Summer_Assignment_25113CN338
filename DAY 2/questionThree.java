import java.util.*;
public class questionThree {
    public static void main(String[] args){
        //Write a program to Find product of digits. 
        System.out.print("Enter the number :");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.out.print("The product of the digits of "+m+" is "+product(m));
    }
    public static int product(int n){
        int r=0;
        int count=1;
        while(n!=0){
            r=n%10;
            count=count*r;
            n=n/10;
        }
        return count;
    }
}
