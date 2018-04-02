package pm;

import java.util.ArrayList;
import java.util.Stack;

public class ExpressionParser {
	
	public Object[] infixToPostfix(String[] infixExperssion) {
		Object[] postfixExpression=null;
		Stack<Object> st = new Stack<Object>();
		ArrayList<Object> arry = new ArrayList<Object>();
		for(String s: infixExperssion) {
			//else if�� �߸��� �ڵ��. �������� ����
			if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
				if(!st.isEmpty() && (s.equals("+") || s.equals("-")) && (st.peek().equals("*") || st.peek().equals("/"))) {
					arry.add(st.pop());
				}
				st.push(s);
			}else if(s.equals("(")) {
				st.push(s);
			}else if(s.equals(")")){
				while(!st.peek().equals("(")) {
					arry.add(st.pop());
				}
				st.pop();
			}else {
				arry.add(s);
			}
		}
		while(!st.isEmpty()) {
			arry.add(st.pop());
		}
		//�������� ArrayList�� �����ϰ� �����ϸ� ���� ���ϰ� ũ��. / ������ ����.
		postfixExpression=arry.toArray();
		return postfixExpression;
	}
	
	public int evalPostfix(Object[] postfixExperssion) {
		int result = 0;
		int subtractor=0;
		int target=0;
		Stack<Object> st = new Stack<Object>();
		for(Object s : postfixExperssion) {
			if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
				subtractor = Integer.parseInt(st.pop().toString());
				target = Integer.parseInt(st.pop().toString());
				result = cal(target,subtractor,s.toString().charAt(0));
				st.push(result);
				System.out.println(st);
			}else {
				st.push(s);
				System.out.println(st);
			}
		}
		
		return result;
	}
	
	public static int cal(int n1, int n2, char op) {
		int result=0;
		
		switch(op) {
		case '+':
			result = n1+n2;
			break;
		case '-':
			result = n1-n2;
			break;
		case '/':
			result = n1/n2;
			break;
		case '*':
			result = n1*n2;
			break;
		}
		
		return result;
	}
}
