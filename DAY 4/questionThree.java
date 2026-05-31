import java.util.*;
public class questionThree {
    public static void main(String[] args){
        //Write a program to Check Armstrong number.
        System.out.print("Enter the number :");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        check(m);
    } 
    public static void check(int n){
        double r=0;
        double count=0;
        int m=n;
        double ans=0;
        while(n!=0){
            r=n%10;
            count++;
            n=n/10;
        }
        n=m;
        r=0;
        while(m!=0){
            r=m%10;
            ans=Math.pow(r, count)+ans;
        }
        if(ans==n){
            System.out.print(n+" is a amstrong number");
        }
        else{
            System.out.print(n+" is not a amstrong number");
        }
    }
}
