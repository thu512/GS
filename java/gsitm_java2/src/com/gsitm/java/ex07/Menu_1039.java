package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 남동길
* @프로그램 설명           : 메뉴클래스
*/
public class Menu_1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1039 user = LoginUser_1039.getInstance();
		System.out.println(user.getName());
		System.out.println(user.getSabun());
		System.out.println(user.getAuthority());
		
		
	}

}
