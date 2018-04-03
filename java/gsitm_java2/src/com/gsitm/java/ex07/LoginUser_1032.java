package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 2.
* @작성자                : 김수진
* @프로그램 설명           : 싱글톤을 구현한 로그인 프로그램
*/
public class LoginUser_1032 {
	//private 으로 선언된 멤버변수들
	private String name = "김수진";
	private int num = 1032;
	private String au = "관리자";
	//getter를 통해 외부에서 접근 제한된 멤버변수 사용가능
	public String getAu() {  //권한
		return au;
	}
	public int getNum() {  //사번
		return num;
	}
	public String getName() {  //이름
		return name;
	}
	//정적 필드
	private static LoginUser_1032 singleton = new LoginUser_1032();
	//생성자
	private LoginUser_1032() {}
	//정적 메소드
	static LoginUser_1032 getInstance() {
		return singleton;
	}
}
