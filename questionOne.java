import java.util.*;
public class questionOne{
    public static void main(String[] args){
        //Write a program to Check whether a number is prime.
        System.out.print("Enter the number : ");
        Scanner n =new Scanner(System.in);
        int m=n.nextInt();
        boolean a=prime(m);
        if(a!=true){
            System.out.print(m+" is not a prime number.");
        }
        else{
            System.out.print(m+" is a prime number");
        }
    }
    public static boolean prime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}