package in.ineuron.assign16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SolutionQueue {
    public boolean canArrangeInIncreasingOrder(Queue<Integer> queue) {
        Queue<Integer> secondQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int expectedElement = 1;

        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!queue.isEmpty() && queue.peek() == expectedElement) {
                // Pop element from the given queue and push it to the second queue
                secondQueue.add(queue.poll());
                expectedElement++;
            } else if (!stack.isEmpty() && stack.peek() == expectedElement) {
                // Pop element from the stack and push it to the second queue
                secondQueue.add(stack.pop());
                expectedElement++;
            } else if (!queue.isEmpty()) {
                // Push element from the given queue to the stack
                stack.push(queue.poll());
            } else {
                // The elements cannot be arranged in increasing order
                return false;
            }
        }

        // Check if the second queue contains all elements in increasing order
        for (int i = 2; i <= secondQueue.size(); i++) {
            if (secondQueue.poll() != i) {
                return false;
            }
        }

        return true;
    }
}

public class ArrangeInIncreasingOrderQ4 {

	public static void main(String[] args) {
		// Question 4
		Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(5);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);

        SolutionQueue solution = new SolutionQueue();
        boolean result1 = solution.canArrangeInIncreasingOrder(queue1);
        System.out.println("Output: " + (result1 ? "Yes" : "No"));

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(5);
        queue2.add(1);
        queue2.add(2);
        queue2.add(6);
        queue2.add(3);
        queue2.add(4);

        boolean result2 = solution.canArrangeInIncreasingOrder(queue2);
        System.out.println("Output: " + (result2 ? "Yes" : "No"));

	}

}
