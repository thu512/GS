package pm;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 입력: ");
//		String msg=sc.nextLine();
//
//		ScriptEngineManager sem = new ScriptEngineManager();
//		ScriptEngine se = sem.getEngineByName("JavaScript");
//
//		try {
//			System.out.println(se.eval(msg));
//		} catch (ScriptException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		if(args.length == 1) {
			System.out.println("args: "+args[0]);
			String expression = args[0].replaceAll(" ", "");
			String[] atoms = expression.split("");
			for(String s : atoms) {
				System.out.println(s);
			}
			System.out.println();
			ExpressionParser ep = new ExpressionParser();
			Object[] atoms2 = ep.infixToPostfix(atoms);
			for(Object s : atoms2) {
				System.out.println(s);
			}
			
			System.out.println("결과: "+ep.evalPostfix(atoms2));
		}else {
			System.out.println("miss");
		}
		
	}
	
	
//msg = msg.replaceAll(" ", "");
//int res = cal(Integer.parseInt(String.valueOf(msg.charAt(0))),
//		Integer.parseInt(String.valueOf(msg.charAt(2))),
//		msg.charAt(1));
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
