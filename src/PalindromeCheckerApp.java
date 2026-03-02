import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
 public class PalindromeCheckerApp {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String str = sc.nextLine();

         Stack<Character> stack = new Stack<>();
         Queue<Character> queue = new LinkedList<>();

         // Push to Stack and Enqueue to Queue
         for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             stack.push(ch);      // LIFO
             queue.add(ch);       // FIFO
         }

         boolean isPalindrome = true;

         // Compare pop (stack) and dequeue (queue)
         for (int i = 0; i < str.length(); i++) {
             if (stack.pop() != queue.remove()) {
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
