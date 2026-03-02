import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * Application entry point FOR uc4
     *
     * character array based palindrome check.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is palindrome?: " + isPalindrome);

        scanner.close();
    }
}