import java.util.Scanner;
import java.util.Stack;

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements palindrome validation using a Stack.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String cleanInput = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 * Captures execution start and end time to display benchmarking results.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeStrategy strategy = new StackStrategy();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean isPalindrome = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}