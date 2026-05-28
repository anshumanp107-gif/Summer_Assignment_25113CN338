import java.util.*;
public class questionThree {
    public static void main(String[] args) {
        //Write a program to Find factorial of a number.
        System.out.print("Input the number :");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        System.out.print("Factorial is "+factorial(m));
    }
    public static int factorial(int n){
        int count=1;
        for(int i=2;i<=n;i++){
            count=count*i;
        }
        return count;
    }
}
