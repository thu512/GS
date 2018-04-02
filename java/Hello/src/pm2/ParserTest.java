package gsitm2018.parser;

import gsitm2018.parser.ExpressionParser;

public class ParserTest {

	static ExpressionParser parser = new ExpressionParser();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			System.out.println("args: " + args[0]);
			
			String expression = args[0];
			String[] atoms = expression.split(" ");
			System.out.println("infixes:");
			for (String oneAtom : atoms) {
				System.out.println(oneAtom);
			}
			
			System.out.println("postfixes:");
			Object[] postfixes = parser.infixToPostfix(atoms);
			for (Object oneAtom : postfixes) {
				System.out.println(oneAtom);
			}
			
			Object result = parser.evaluatePostfixExpression(postfixes);
			System.out.println("result: " + result);
		} else {
			System.out.println("Enter string expression!");
		}

	}

}
