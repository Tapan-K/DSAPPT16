package in.ineuron.assign16;

import java.util.Scanner;
import java.util.Stack;

class Solution7 {
    public int countWordsLeft(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop(); // Destroy the similar words
            } else {
                stack.push(word); // Push the word onto the stack
            }
        }

        return stack.size();
    }
}

public class CountWordLeftQueueQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        String[] words = new String[n];
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        Solution7 solution = new Solution7();
        int count = solution.countWordsLeft(words);

        System.out.println("Number of words left: " + count);

	}

}
