import java.util.Scanner;

/**
 * MAIN CLASS UseCase11PalindromeCheckerApp
 * Use Case 11: Palindrome Checker
 *
 * Description:
 * This class validates whether a given string is a palindrome.
 * It handles case-insensitive comparison and ignores non-alphanumeric characters.
 *
 * Author: Developer
 * Version: 11.0
 */
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        // Normalize input: remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);

        scanner.close();
    }
}