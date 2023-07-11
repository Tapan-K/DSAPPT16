package in.ineuron.assign16;
import java.util.Stack;

class Solution5 {
    public int reverseNumber(int num) {
        Stack<Integer> stack = new Stack<>();

        // Extract the digits and push them onto the stack
        while (num != 0) {
            int digit = num % 10;
            stack.push(digit);
            num /= 10;
        }

        int reversedNum = 0;
        int placeValue = 1;

        // Pop the digits from the stack to form the reversed number
        while (!stack.isEmpty()) {
            int digit = stack.pop();
            reversedNum += digit * placeValue;
            placeValue *= 10;
        }

        return reversedNum;
    }
}

public class reverseNumUsongStackQ5 {

	public static void main(String[] args) {
		// Question 5
		int num = 365;

		Solution5 solution = new Solution5();
        int reversedNum = solution.reverseNumber(num);

        System.out.println("Output: " + reversedNum);

	}

}
