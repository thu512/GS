package com.gsitm.java.ex07;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName         : Menu_1065.java 
* @Project          : gsitm_java2 
* @Date           	: 2018. 4. 2. 
* @작성자           	: 정광수
* @프로그램 설명       : LoginUser 호출해서 사용  (싱글톤 예제)
*/
public class Menu_1065 {
	
	public static void main(String[] args) {
		//싱글톤 객체 가져오기
		LoginUser_1065 loginUser_1065=LoginUser_1065.getInstance();
		//게터세터 삽입
		loginUser_1065.setName("정광수");
		loginUser_1065.setSabun(1065);
		loginUser_1065.setPrivilege(1);
		
		//출력
		System.out.println(loginUser_1065);
	}

}
