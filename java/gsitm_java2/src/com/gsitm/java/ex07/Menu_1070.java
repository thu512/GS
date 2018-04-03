package com.gsitm.java.ex07;

import java.util.Scanner;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 주형진
* @프로그램 설명           : 로그인 메뉴(싱글톤 호출)
*/
public class Menu_1070 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("1. 로그인");
		System.out.println("========================");
		System.out.print("원하는 번호를 선택해주세요. : ");
		
		int selectNum = sc.nextInt();
		
		switch(selectNum) {
		case 1:
			LoginMenu();
		}
		
	}
	
	static void LoginMenu() {
		int inputEmpNo;
		String inputName;
		String auth;
		LoginUser_1070 m_user = LoginUser_1070.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.print("1. 사번 입력 : ");
		inputEmpNo = sc.nextInt();
		System.out.print("2. 이름 입력 : ");
		inputName = sc.next();
		System.out.print("3. 권한 입력 : ");
		auth = sc.next();
		
		m_user.setM_empNo(inputEmpNo);
		m_user.setM_name(inputName);
		m_user.setM_auth(auth);
		
		System.out.println("로그인 완료!!");
	}
}