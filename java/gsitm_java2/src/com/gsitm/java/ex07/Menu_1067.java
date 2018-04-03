package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1067.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 조국
* @프로그램 설명           : Singleton 패턴 구현을 위한 예제의 Main 클래스
*/
public class Menu_1067 {
	public static void main(String[] args) {
		// instance value
		LoginUser_1067 loginUser = LoginUser_1067.getInstance();
		
		System.out.println("=======Singleton 예제=======");
		System.out.println("이름: " + loginUser.getName());
		System.out.println("사번: " + loginUser.getSsn());
		System.out.println("권한: " + loginUser.getAuthority());
	}
}
