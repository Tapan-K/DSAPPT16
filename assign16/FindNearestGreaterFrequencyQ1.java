package in.ineuron.assign16;
import java.util.*;

class Solution {
    public int[] findNearestGreaterFrequency(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Count the frequency of each element in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int i = n - 1; i >= 0; i--) {
            int currentFrequency = frequencyMap.get(arr[i]);
            while (!stack.isEmpty() && frequencyMap.get(stack.peek()) <= currentFrequency) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;
    }
}


public class FindNearestGreaterFrequencyQ1 {

	public static void main(String[] args) {
		// Question 1
		Solution solution = new Solution();
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        int[] result = solution.findNearestGreaterFrequency(arr);

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
