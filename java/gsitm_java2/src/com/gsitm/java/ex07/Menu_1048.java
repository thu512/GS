package com.gsitm.java.ex07;

/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Menu_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 4. 2. 
* @작성자			    : 신종욱
* @프로그램 설명       : 싱글톤을 디자인 패턴을 이용한 로그인 연습 프로그램
*/
public class Menu_1048 {
	public static void main(String[] args) {
		LoginUser_1048 l1 = LoginUser_1048.getInstance();
		LoginUser_1048 l2 = LoginUser_1048.getInstance();
		
//		같은 객체를 참조함
		if (l1 == l2) {
			System.out.println("같은 객체 참조하는듯");
		}
		
		l1.setName("shin");
		l1.seteNum(1048);
		l1.setAuth("intern");
		
		System.out.println("name : " + l1.getName());
		System.out.println("eNum : " + l1.geteNum());
		System.out.println("auth : " + l1.getAuth());
	}

}
