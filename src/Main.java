import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * MAIN CLASS UseCase7PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * Characters are inserted into the deque and then compared by removing elements from both ends:
 * removeFirst() and removeLast()
 * This avoids reversing the string and provides an efficient front-to-back comparison approach.
 * This use case demonstrates optimal bidirectional traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */
public class Main {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome!");
        } else {
            System.out.println("❌ The string is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if a string is a palindrome using a Deque.
     *
     * @param str Input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();

        // Add all characters to the deque
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and back
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}