import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int max = getMax(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + max);
    }

    private static int getMax(int num1, int num2) {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}