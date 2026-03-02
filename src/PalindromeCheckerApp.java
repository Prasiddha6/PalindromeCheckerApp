import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            int start = 0;
            int end = word.length() - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is NOT a Palindrome");
            }

            sc.close();
        }
    }