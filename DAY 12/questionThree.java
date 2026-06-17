import java.util.Scanner;

class questionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of Fibonacci: ");
        int input = scanner.nextInt();
        fib(input);
    }
    public static void fib(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}