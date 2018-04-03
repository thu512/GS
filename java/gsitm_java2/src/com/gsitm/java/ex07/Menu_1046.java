package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 손혜성
* @프로그램 설명           : 싱글톤 연습(메뉴)
*/
public class Menu_1046 {

	public static void main(String[] args) {
		LoginUser_1046 user = LoginUser_1046.getInstance();
		
		user.setName("손혜성");
		user.setId("IT1046");
		user.setRight("nothing");
		
		System.out.println("현재 로그인 된 유저의 이름 : " + user.getName() + " 사번 : " + user.getId() + " 권한 : " + user.getRight());
	}

}
