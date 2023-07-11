package in.ineuron.assign16;
import java.util.Stack;

class Solution1 {
    public void deleteMiddle(Stack<Integer> stack, int k) {
        
        if (stack.isEmpty() || k == 0) {
            stack.pop();
            return;
        }

        
        int temp = stack.pop();
        deleteMiddle(stack, k - 1);

        
        stack.push(temp);
    }

    public void deleteMiddleElement(Stack<Integer> stack) {
        int n = stack.size();
        int k = n / 2 + 1; 

        deleteMiddle(stack, k);
    }
}


public class DeleteMiddleElementStackQ3 {

	public static void main(String[] args) {
		// Question 3
		Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        Solution1 solution = new Solution1();
        solution.deleteMiddleElement(stack1);

        System.out.print("Output: ");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        solution.deleteMiddleElement(stack2);

        System.out.print("Output: ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();

	}

}
