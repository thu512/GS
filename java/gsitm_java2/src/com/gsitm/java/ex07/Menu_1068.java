package com.gsitm.java.ex07;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Menu_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 2.
 * @작성자            : 조은솔
 * @프로그램 설명            : 싱글턴 예제
 */
public class Menu_1068 {
	
	public static void main(String[] args) {
		
		LoginUser_1068 user = LoginUser_1068.getInstance();
		user.getName();
		
	}
}
