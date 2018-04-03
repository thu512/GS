package com.gsitm.java.ex07;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Menu_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 2.
 * @작성자            : 위재원
 * @프로그램 설명      		: LoginUser클래스를 선언하고 세터,게터 이용 하는 클래스
 */
public class Menu_1051 {

	public static void main(String[] args) {
		LoginUser_1051 loginUser = LoginUser_1051.getInstance();
		LoginUser_1051 loginUser2 = LoginUser_1051.getInstance();
		//LoginUser_1051 loginUser3 = new LoginUser_1051();
		
		loginUser.setName("위재원");
		loginUser.setSabun("1051");
		loginUser.setPower("인턴사원");
		
		System.out.println(loginUser.getName());
		System.out.println(loginUser.getPower());
		System.out.println(loginUser.getSabun());
		
		System.out.println(loginUser2.getName());
		System.out.println(loginUser2.getPower());
		System.out.println(loginUser2.getSabun());
		
//		System.out.println(loginUser3.getName());
//		System.out.println(loginUser3.getPower());
//		System.out.println(loginUser3.getSabun());
	}
}
