package com.gsitm.java.ex07;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 2.
* @작성자              : 이종건
* @프로그램 설명       : 싱글톤 객체 실습
*
* 1. 싱클턴을 구현한 LoginUser_1059 클래스를 생성하고,
* 2. 외부 클래스에서 Menu_1059의 이름, 사번, 권한을 얻어낼 수 있도록 합니다.
* 3. LoginUser는 멤버변수로 이름, 사번, 권한을 갖습니다.
* 4. 이름, 사번, 권한은 private으로 접근 제한되며, getter/setter를 통해 외부에서 읽고 쓸수 있다.
* 
*/
public class Menu_1059 {

	public static void main(String[] args) {
		// 싱글톤 객체 생성.
		LoginUser_1059 obj1 = LoginUser_1059.getInstance();
		
		// setter
		obj1.setName("이종건");		
		obj1.setMemberNum(1059);
		obj1.setAuthority("인턴");
		
		// getter를 이용해서 정보를 가져와 출력.
		System.out.println("이름 " + obj1.getName());
		System.out.println("사번 " + obj1.getMemberNum());
		System.out.println("권한 " + obj1.getAuthority());
	}

}
