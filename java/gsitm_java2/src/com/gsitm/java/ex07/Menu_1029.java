package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 고하윤
* @프로그램 설명           : LoginUser의 이름, 사번 권한 얻어내는 클래스
*/
public class Menu_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1029 user1 = LoginUser_1029.getInstance();
		
		System.out.println("이름 : " + user1.getName());
		System.out.println("사번 : " + user1.getEmployeeNum());
		System.out.println("권한 : " + user1.isAuthority());
	}

}
