import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome using string reverse
    public static boolean isPalindrome(String input) {

        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call palindrome check method
        boolean result = isPalindrome(userInput);

        // Display result
        if (result) {
            System.out.println("Result: The given string IS a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}