import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
 public class PalindromeCheckerApp {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String input = sc.nextLine();

         // Normalize: remove spaces and convert to lowercase
         String str = input.replaceAll("\\s+", "").toLowerCase();

         // Check palindrome (using simple loop)
         boolean isPalindrome = true;
         int n = str.length();
         for (int i = 0; i < n / 2; i++) {
             if (str.charAt(i) != str.charAt(n - 1 - i)) {
                 isPalindrome = false;
                 break;
             }
         }

         if (isPalindrome) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not Palindrome");
         }

         sc.close();
     }}
