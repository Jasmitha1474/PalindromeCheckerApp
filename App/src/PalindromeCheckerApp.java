import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * Application entry point FOR uc3
     *
     * Reverse string based palindrome.
     *
     * @param args Command-line arguements
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();

    }
}