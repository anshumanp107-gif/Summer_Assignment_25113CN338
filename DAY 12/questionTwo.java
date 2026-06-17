import java.util.Scanner;

public class questionTwo {

    public static boolean isArmstrong(int num) {
        if (num < 0) {
            return false;
        }
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }    
    }
}
