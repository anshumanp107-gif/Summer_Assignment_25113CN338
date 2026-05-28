import java.util.*;
public class questionFour {
    public static void main(String[] args) {
        //Write a program to Count digits in a number.
        System.out.print("Enter the number :");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.out.println("Number of digits are :"+ digi(m));
    }
    public static int digi(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
}
