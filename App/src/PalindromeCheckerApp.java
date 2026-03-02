import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    /**
     * Application entry point FOR uc5
     *
     *Stack-Based Palindrome Checker.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Required output format
        System.out.println("Is palindrome?: " + isPalindrome);

        scanner.close();
    }
}
