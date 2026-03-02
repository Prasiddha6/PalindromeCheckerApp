import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
 public class PalindromeCheckerApp {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String str = sc.nextLine();

         Deque<Character> deque = new ArrayDeque<>();

         // Insert characters into deque
         for (int i = 0; i < str.length(); i++) {
             deque.addLast(str.charAt(i));
         }

         boolean isPalindrome = true;

         // Compare front and rear
         while (deque.size() > 1) {
             char front = deque.removeFirst();
             char rear = deque.removeLast();

             if (front != rear) {
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
