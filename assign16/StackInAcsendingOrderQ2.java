package in.ineuron.assign16;
import java.util.Stack;

class SolutionStack {
    public Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            int temp = inputStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                inputStack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Transfer elements from temporary stack back to input stack
        while (!tempStack.isEmpty()) {
            inputStack.push(tempStack.pop());
        }

        return inputStack;
    }
}

public class StackInAcsendingOrderQ2 {

	public static void main(String[] args) {
		// Question 2
		Stack<Integer> inputStack = new Stack<>();
        inputStack.push(34);
        inputStack.push(3);
        inputStack.push(31);
        inputStack.push(98);
        inputStack.push(92);
        inputStack.push(23);

        SolutionStack solution = new SolutionStack();
        Stack<Integer> sortedStack = solution.sortStack(inputStack);

        System.out.print("Output: ");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
        System.out.println();

	}

}
