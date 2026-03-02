import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
 public class PalindromeCheckerApp {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String str = sc.nextLine();

         if (isPalindrome(str)) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not Palindrome");
         }

         sc.close();
     }

     // Simple recursive function
     private static boolean isPalindrome(String str) {
         // Base case: empty or single char
         if (str.length() <= 1) {
             return true;
         }

         // Compare first and last characters
         if (str.charAt(0) != str.charAt(str.length() - 1)) {
             return false;
         }

         // Recurse on substring without first and last char
         return isPalindrome(str.substring(1, str.length() - 1));
     }}
