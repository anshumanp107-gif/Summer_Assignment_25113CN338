import java.util.*;
public class questionFour {
    public static void main(String[] args){
        //Write a program to Check whether a number is palindrome.
        System.out.print("Enter the number : ");
        Scanner n =new Scanner(System.in);
        int m = n.nextInt();
        if(m==rev(m)){
            System.out.print(m+" is a palindrome.");
        }
        else{
            System.out.print(m+" is not a palindrome.");
        }
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
