package in.ineuron.assign16;
import java.util.*;

class SolutionQueue6 {
    public void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first k elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Enqueue the elements from the stack back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Rotate the remaining elements to maintain their order
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
    }
}


public class ReverseElementInQueueQ6 {

	public static void main(String[] args) {
		// Question 6
		Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        SolutionQueue6 solution = new SolutionQueue6();
        solution.reverseFirstKElements(queue, k);

        System.out.print("Output: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

	}

}
