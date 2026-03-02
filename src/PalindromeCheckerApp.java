import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
 public class PalindromeCheckerApp {
     // Node class for singly linked list
     static class Node {
         char data;
         Node next;

         Node(char data) {
             this.data = data;
             this.next = null;
         }
     }

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: ");
         String str = sc.nextLine();

         // Convert string to linked list
         Node head = null;
         Node tail = null;
         for (int i = 0; i < str.length(); i++) {
             Node newNode = new Node(str.charAt(i));
             if (head == null) {
                 head = newNode;
                 tail = newNode;
             } else {
                 tail.next = newNode;
                 tail = newNode;
             }
         }

         // Check palindrome
         boolean isPalindrome = checkPalindrome(head);
         if (isPalindrome) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not Palindrome");
         }

         sc.close();
     }

     // Function to check palindrome using singly linked list
     private static boolean checkPalindrome(Node head) {
         if (head == null || head.next == null)
             return true;

         // Find middle using fast and slow pointers
         Node slow = head, fast = head;
         while (fast.next != null && fast.next.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }

         // Reverse second half
         Node secondHalf = reverse(slow.next);

         // Compare first and second halves
         Node firstHalf = head;
         Node tempSecond = secondHalf;
         boolean isPalin = true;
         while (tempSecond != null) {
             if (firstHalf.data != tempSecond.data) {
                 isPalin = false;
                 break;
             }
             firstHalf = firstHalf.next;
             tempSecond = tempSecond.next;
         }

         // Optional: Restore the original list
         slow.next = reverse(secondHalf);

         return isPalin;
     }

     // Function to reverse a linked list
     private static Node reverse(Node head) {
         Node prev = null;
         Node current = head;
         while (current != null) {
             Node nextNode = current.next;
             current.next = prev;
             prev = current;
             current = nextNode;
         }
         return prev;
     }}
