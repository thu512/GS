package com.gsitm.practice.ex01;

import java.lang.reflect.Method;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ExClass_1056.java 
* @Project				: gsitm_java 
* @Date					: 2018. 3. 28. 
* @작성자					: 이상훈
* @프로그램 설명			: 다양한 실습을 하는 프로그램
*/
public class ExClass_1056 {
	public static void main(String[] args) throws Exception {
		System.out.println("고양이");
		
		loadAndExecute("com.gsitm.practice.ex01.HandlerA");
	}
	
	/** 
	* @MethodName			: loadAndExecute 
	* @Date					: 2018. 3. 28. 
	* @param className
	* @throws Exception
	* 
	* @MethodInfo			: 자바 리플렉션을 연습하기 위해 만든 메서드
	*/
	public static void loadAndExecute(String className) throws Exception {
		Class c = null;
		c = Class.forName(className);
		Object target = c.newInstance();
		Method m = c.getDeclaredMethod("setMsg", String.class);
		m.invoke(target, "Hello");
		m = c.getDeclaredMethod("handle");
		m.invoke(target);
	}
}



/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ExClass_1056.java 
* @Project				: gsitm_java 
* @Date					: 2018. 3. 28. 
* @작성자					: 이상훈
* @프로그램 설명			: 리플렉션을 해보기 위한 타겟 클래스
*/
class HandlerA{
	private String msg;
	public void setMsg (String msg) {
		this.msg = msg;
	}
	
	public void handle() {
		System.out.println(msg);
	}
}
