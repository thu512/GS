package com.gsitm.java.ex07;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Menu_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 4. 2. 
* @작성자				: 최규호
* @프로그램 설명		: 싱글톤 객체 관련 프로그램
*/
public class Menu_1074 {

	public static void main(String[] args) {
		LoginUser_1074 user1 = LoginUser_1074.getInstance();
		
		user1.setName("최규호");
		user1.setNum(1074);
		user1.setAllow(true);
		
		System.out.println("이름:" + user1.getName());
		System.out.println("사번:" + user1.getNum());
		System.out.println("권한:" + user1.isAllow());
	}

}
