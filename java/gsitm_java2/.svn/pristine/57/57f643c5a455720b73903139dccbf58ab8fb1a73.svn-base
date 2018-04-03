package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1067.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 조국
* @프로그램 설명           : Singleton 패턴 구현을 위한 예제의 LoginUser 클래스
*/
public class LoginUser_1067 {
	// variable
	private String name;	// 이름
	private int ssn;	// 사번
	private String authority;	// 권한
	private static LoginUser_1067 loginUser = new LoginUser_1067(); // Singleton 패턴을 위한 new 메소드

	// 생성자
	private LoginUser_1067() { 
		// 임의로 초기화
		this.name = "조국";
		this.ssn = 1067;
		this.authority = "master";
	}
	
	// Singleton 패턴의 getInstance 메소드
	public static LoginUser_1067 getInstance() { return loginUser; }

	// Getter/Setter
	public String getName() { return name; }
	public int getSsn() { return ssn; }
	public String getAuthority() { return authority; }
}
