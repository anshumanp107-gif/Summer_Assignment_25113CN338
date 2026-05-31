import java.util.*;
public class questionFour {
    public static void main(String[] args){
        //Write a program to Print Armstrong numbers in a range. 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start and end of the range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int count = 0;

            // Count digits
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            // Calculate sum of digits raised to count
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}