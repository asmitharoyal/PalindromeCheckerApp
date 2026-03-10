import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        if(cleaned.equals(reversed)){
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}