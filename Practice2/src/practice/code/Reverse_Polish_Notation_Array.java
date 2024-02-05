package practice.code;

import java.util.Stack;

public class Reverse_Polish_Notation_Array {
	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (String t : tokens) {
			if (!operators.contains(t)) { // push to stack if it is a number
				stack.push(t);
			} else {// pop numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}
	public static void main(String[] args) {
      String[] str= {"2", "1", "+", "3","*"};
      int result=evalRPN(str);
      System.out.println(result);
	}

}
