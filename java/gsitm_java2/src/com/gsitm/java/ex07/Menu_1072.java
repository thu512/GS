package com.gsitm.java.ex07;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Menu_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 4. 2.
 * @작성자			: 차주현
 * @프로그램 설명	: 싱글턴 클래스 LoginUser의 인스턴스를 갖고오고, 멤버변수들을 설정하고 출력합니다.
 */
public class Menu_1072 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginUser_1072 loginUser = LoginUser_1072.getInstance();
		loginUser.setName("차주현");
		loginUser.setIdNum("IT1072");
		loginUser.setAuth("관리자");
		
		System.out.println("이름: " + loginUser.getName());
		System.out.println("사번: " + loginUser.getIdNum());
		System.out.println("권한: " + loginUser.getAuth());
		
		LoginUser_1072 loginUser2 = LoginUser_1072.getInstance();
		System.out.println("------------------------------");
		System.out.println("이름: " + loginUser.getName());
		System.out.println("사번: " + loginUser.getIdNum());
		System.out.println("권한: " + loginUser.getAuth());
	}
}
