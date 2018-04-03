package com.gsitm.java.ex07;

/**
 * <pre>
* 1. 패키지명 : com.gsitm.java.ex07
* 2. 타입명 : Menu_1034.java
* 3. 작성일 : 2018. 4. 2. 오전 9:51:38
* 4. 작성자 : JongJoo
* 5. 설명 : 싱글톤 만들기.
 * </pre>
 */
public class Menu_1034 {

	static String cName = "hello";
	static int cNum = 123;
	static boolean cAuth = false;

	public static void main(String[] args) {

		LoginUser_1034 ob = LoginUser_1034.getSingleton();

		System.out.println(ob.getName());
		System.out.println(ob.getC_num());
		System.out.println(ob.isAuth());
		ob.setName(cName);
		ob.setC_num(cNum);
		ob.setAuth(cAuth);
		System.out.println(" ");
		System.out.println(ob.getName());
		System.out.println(ob.getC_num());
		System.out.println(ob.isAuth());
	}
}
