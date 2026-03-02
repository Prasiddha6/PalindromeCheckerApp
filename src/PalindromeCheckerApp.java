import java.util.Scanner;
import java.util.Stack;
 public class PalindromeCheckerApp {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String str = sc.nextLine();

         Stack<Character> stack = new Stack<>();

         // Push characters into stack
         for (int i = 0; i < str.length(); i++) {
             stack.push(str.charAt(i));
         }

         // Check palindrome
         boolean isPalindrome = true;

         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) != stack.pop()) {
                 isPalindrome = false;
                 break;
             }
         }

         if (isPalindrome)
             System.out.println("Palindrome");
         else
             System.out.println("Not Palindrome");

         sc.close();
     }}
