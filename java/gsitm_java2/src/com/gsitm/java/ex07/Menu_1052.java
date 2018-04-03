package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 박보미
* @프로그램 설명           : 싱글톤 구현  
*/
public class Menu_1052 {

	public static void main(String[] args) {

		LoginUser_1052 singleton1 = LoginUser_1052.getInstance();
		LoginUser_1052 singleton2 = LoginUser_1052.getInstance();

		singleton1.init("박보미", 1052, "인턴사원");
		
		System.out.println("이름 : " + singleton2.getName());
		System.out.println("사번 : " + singleton2.getNumber());
		System.out.println("권한 : " + singleton2.getAuth());
		
		System.out.println("생성한 두 객체가 같은 지 확인 : " + (singleton1 == singleton2));
		System.out.println("singleton1 정보 : "+ singleton1);
		System.out.println("singleton2 정보 : "+ singleton2);
		
	}

}
