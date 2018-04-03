package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1041.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 박민주
* @프로그램 설명           : 싱글톤활용
*/
public class Menu_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginUser_1041 logins = LoginUser_1041.getInstance();
	
	
		logins.setName("박민주");
		logins.setId("1041");
		logins.setCheck("권한");
		
		System.out.println("1번째 싱글톤");
		System.out.println(logins.getName());
		System.out.println(logins.getId());
		System.out.println(logins.getCheck());

		LoginUser_1041 logins1 = LoginUser_1041.getInstance();
		
		System.out.println("2번째 싱글톤을만들었지만 값은 같다");
		System.out.println(logins1.getName());
		System.out.println(logins1.getId());
		System.out.println(logins1.getCheck());
	}

}
