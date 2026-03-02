import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String word = "madam";

        if (checker.checkPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}