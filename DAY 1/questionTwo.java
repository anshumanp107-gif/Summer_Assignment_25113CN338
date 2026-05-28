import java.util.*;

public class questionTwo {
    public static void main(String[] args) {
        //Write a program to Print multiplication table of a given number.
        System.out.print("Input the number : ");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        table(m);
    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
