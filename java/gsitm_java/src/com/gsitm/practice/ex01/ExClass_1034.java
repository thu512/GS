package com.gsitm.practice.ex01;

/**
* <pre>
* 1. 패키지명 : com.gsitm.practice.ex01
* 2. 타입명 : ExClass_1034.java
* 3. 작성일 : 2018. 3. 28. 오전 10:41:15
* 4. 작성자 : JongJoo
* 5. 설명 :
* </pre>
*/
public class ExClass_1034{   

	/**
	* <pre>
	* 1. 메소드명 : main
	* 2. 작성일 : 2018. 3. 28. 오전 10:41:18
	* 3. 작성자 : JongJoo
	* 4. 설명 :
	* </pre>
	* @param arg
	*/
	public static void main(String arg[]) {
		//占쏙옙占쏙옙繭占쏙옙 占쏙옙占쌘울옙占쏙옙 占쏙옙占쏙옙求占� 占쏙옙占식소듸옙 占쌉니댐옙.
		System.out.println("Hello");
		
		int i =0;
		double dd = 1.1;//占썩본占쏙옙 primitive)
		Double doubl = new Double(1.1);	//占쏙옙占쏙옙 클占쏙옙占쏙옙  Wrapper Class
		
		String var = "10";
//		int var2 = Integer.parseInt(var);
		
		//Boxing / unBoxing
		
		Double doub = new Double(1.1); // Boxing
		double ddd= doub.doubleValue(); // unBoxing
		
		//auto boxing
		double d = doub;
		
		int in = 10; // Auto Boxing
		int ii = in;	// Auto unboxing
		Object o = 10;	// Auto Boxing
	}
	
	//wrapper class 
//	byte Byte{
//		
//	}
	/**
	* <pre>
	* 1. 패키지명 : com.gsitm.practice.ex01
	* 2. 타입명 : ExClass_1034.java
	* 3. 작성일 : 2018. 3. 28. 오전 10:41:22
	* 4. 작성자 : JongJoo
	* 5. 설명 :
	* </pre>
	*/
	class Integer{
		int i =0;
	}
	

	void stt() {
		
	}
}