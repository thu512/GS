package com.gsitm.java.ex07;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자              : 이창주
* @프로그램 설명       : 싱글턴클래스 호출 메뉴클래스
*/
public class Menu_1060 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1060 lu = LoginUser_1060.getInstance();
		System.out.println(lu.getName());
		System.out.println(lu.getSabun());
		System.out.println(lu.getAuthority());
		boolean b = true;
		System.out.println();
		System.out.println();
	}
}