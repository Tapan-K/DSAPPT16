package in.ineuron.assign16;

import java.util.Stack;

class Solution8 {
    public int maxAbsoluteDifference(int[] arr) {
        int n = arr.length;

        int[] leftNSE = new int[n];
        int[] rightNSE = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Finding the next smaller element on the left side
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftNSE[i] = 0;
            } else {
                leftNSE[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        stack.clear(); // Clear the stack for re-use

        // Finding the next smaller element on the right side
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightNSE[i] = 0;
            } else {
                rightNSE[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        int maxDifference = 0;

        // Calculate the maximum absolute difference
        for (int i = 0; i < n; i++) {
            maxDifference = Math.max(maxDifference, Math.abs(leftNSE[i] - rightNSE[i]));
        }

        return maxDifference;
    }
}

public class MaximumAbsoluteDifferenceQ8 {

	public static void main(String[] args) {
		// Question 8
		int[] arr = {2, 1, 8};

        Solution8 solution = new Solution8();
        int maxDifference = solution.maxAbsoluteDifference(arr);

        System.out.println("Maximum Absolute Difference: " + maxDifference);
    }

	}


