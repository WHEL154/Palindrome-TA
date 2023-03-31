import java.util.*;

public class palindromechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to use Palindrome Checker: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isaPalindrome = true;

        while (!stack.empty()) {
            if (stack.pop() != queue.remove()) {
                isaPalindrome = false;
                break;
            }
        }

        if (isaPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}