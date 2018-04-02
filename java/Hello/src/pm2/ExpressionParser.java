package gsitm2018.parser;

import java.util.ArrayList;
import java.util.Stack;

public class ExpressionParser {
	
	public Object[] infixToPostfix(String[] infixExpression) {
		Object[] postfixExpression = null;
		
		/**
		 * 1, +, 2 => 1, 2, +
		 */
		
		ArrayList<Object> out = new ArrayList<Object>();
		Stack<Object> stack = new Stack<Object>();
		
		for (String oneAtom : infixExpression) {
			if (oneAtom.equals("(")) {
				stack.push(oneAtom);
			} else if (oneAtom.equals(")")) {
				while(!stack.empty()) {
					Object stackObj = stack.peek();
					if (stackObj.toString().equals("(")) {
						stack.pop();
						break;
					} else {
						out.add(stack.pop());
					}
				}
			}
			else if (oneAtom.equals("+")) {
				while (!stack.empty()) {
					Object stackObj = stack.peek();
					if (stackObj.toString().equals("*")) {
						out.add(stack.pop());
					} else {
						break;
					}
				}
				stack.push(oneAtom);
			} else if (oneAtom.equals("-")) {
				while (!stack.empty()) {
					Object stackObj = stack.peek();
					if (stackObj.toString().equals("*")) {
						out.add(stack.pop());
					} else {
						break;
					}
				}
				stack.push(oneAtom);
			}  else if (oneAtom.equals("*")) {
				stack.push(oneAtom);
			}  else if (oneAtom.equals("/")) {
				stack.push(oneAtom);
			}
			else {
				out.add(oneAtom);
			}
		}
		
		while(!stack.empty()) {
			out.add(stack.pop());
		}
		
		postfixExpression = out.toArray();
		return postfixExpression;
	}
	
	public Object evaluatePostfixExpression(Object[] postfixes) {
		Object result = null;
		
		Stack<Object> stack = new Stack<Object>();
		
		for (Object oneAtom : postfixes) {
			if (oneAtom.equals("+")) {
				Object op1 = stack.pop();
				Object op2 = stack.pop();
				double value = 
						Double.parseDouble(op1.toString()) +
						Double.parseDouble(op2.toString());
				stack.push(value);
			} else if (oneAtom.equals("-")) {
				Object subtractor = stack.pop();
				Object target = stack.pop();
				double value = 
						Double.parseDouble(target.toString()) -
						Double.parseDouble(subtractor.toString());
				stack.push(value);
			} else if (oneAtom.equals("*")) {
				Object op2 = stack.pop();
				Object op1 = stack.pop();
				double value = 
						Double.parseDouble(op1.toString()) *
						Double.parseDouble(op2.toString());
				stack.push(value);
			
			} else if (oneAtom.equals("/")) {
				Object divisor = stack.pop();
				Object dividened = stack.pop();
				double value = 
						Double.parseDouble(dividened.toString()) /
						Double.parseDouble(divisor.toString());
				stack.push(value);
			}
			else {
				stack.push(oneAtom);
			}
		}
		
		if (!stack.isEmpty()) {
			result = stack.pop();
		}

		return result;
	}
}
