import java.util.Scanner;

public class fact {

    // Method 1: Using iterative approach
    private static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Method 2: Using recursive approach
    private static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    // Main method to prompt user for input and test the two factorial methods
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a  positive number: ");
            int number = scanner.nextInt();
            System.out
                    .println("The Factorial of " + number + " using iterative approach is: "
                            + factorialIterative(number));
            System.out
                    .println("The Factorial of " + number + " using recursive approach is: "
                            + factorialRecursive(number));
        }
    }
}
