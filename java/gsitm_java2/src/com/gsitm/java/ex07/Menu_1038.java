package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex07
* @Date                : 2018. 4. 2. 오전 9:40:02
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
* 1. 싱글톤을 구현한 LoginUser_사번 클래스를 생성하고,
  2. 외부 클래스에서 LoginUser의 이름, 사번을 얻어낼 수 있도록 합니다.
  3. LoginUser는 멤버변수로 이름, 사번, 권한을 갖습니다.
  4. 이름, 사번, 권한은 private으로 접근 제한되며, getter/setter를 통해 외부에서 읽고 쓸 수 있다.
*/
public class Menu_1038 {
	public static void main(String[] args) {
		LoginUser_1038 login = LoginUser_1038.getSingleton();
		System.out.println(login.getAuth());
		System.out.println(login.getDept());
		System.out.println(login.getSabeon());
		System.out.println(login.getName());
		System.out.println("");
		login.setAuth("부장");
		System.out.println(login.getAuth());
		System.out.println(login.getName());
	}
	
}
