import java.util.Scanner;
import java.util.Stack;

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements palindrome validation using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;

        // Normalize input: remove case sensitivity
        String cleanInput = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Mismatch found
            }
        }

        return true;
    }
}

/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * Demonstrates runtime strategy injection.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Setup the Strategy (using the Stack implementation)
        PalindromeStrategy strategy = new StackStrategy();

        // 2. Get User Input
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 3. Execute the selected algorithm
        boolean isPalindrome = strategy.check(input);

        // 4. Output results
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}