package com.gsitm.java.ex07;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 2.
* @작성자              : 이종건
* @프로그램 설명       : 싱글톤 객체 실습
*
* 1. 싱클턴을 구현한 LoginUser_1059 클래스를 생성하고,
* 2. 외부 클래스에서 LoginUser_1059의 이름, 사번, 권한을 얻어낼 수 있도록 합니다.
* 3. LoginUser는 멤버변수로 이름, 사번, 권한을 갖습니다.
* 4. 이름, 사번, 권한은 private으로 접근 제한되며, getter/setter를 통해 외부에서 읽고 쓸수 있다.
* 
*/
public class LoginUser_1059 {
	private static LoginUser_1059 singleton = new LoginUser_1059();
	
	// 사번
	private int memberNum;
	
	// 이름
	private String name;
	
	// 권한
	private String authority;
	
	// private 생성자
	private LoginUser_1059() {}
	
	// static getInstance() return 싱글톤 객체.
	static LoginUser_1059 getInstance() {
		return singleton;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
