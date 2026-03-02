import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static boolean simpleCheck(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackCheck(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    public static boolean dequeCheck(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) deque.add(c);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        long startTime = System.nanoTime();
        boolean simpleResult = simpleCheck(word);
        long simpleTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        boolean stackResult = stackCheck(word);
        long stackTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequeCheck(word);
        long dequeTime = System.nanoTime() - startTime;

        System.out.println("Algorithm\tResult\tExecution Time (ns)");
        System.out.println("Simple\t\t" + simpleResult + "\t" + simpleTime);
        System.out.println("Stack\t\t" + stackResult + "\t" + stackTime);
        System.out.println("Deque\t\t" + dequeResult + "\t" + dequeTime);

        sc.close();
    }
}