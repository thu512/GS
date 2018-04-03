package com.gsitm.java.ex07;

/** 
*    @과목명               : GS ITM 인턴사원 자바교육
*    @FileName            : LoginUser_1075.java 
*    @Project             : gsitm_java2 
*    @Date                : 2018. 4. 2. 
*    @작성자                : 최영롱
*    @프로그램 설명          : singleton 클래스
*/
public class LoginUser_1075 {
	//정적 필드
	private static LoginUser_1075 singleton = new LoginUser_1075();
	//생성자
	private LoginUser_1075() {
		this.name = "rong";
		this.companyNum = 1075;
		this.authority = true;
	}
	//정적 메소드
	static LoginUser_1075 getInstance() {
		return singleton;
	}
	//멤버 변수 선언
	private String name;
	private int companyNum;
	private boolean authority;
	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCompanyNum() {
		return companyNum;
	}
	public void setCompanyNum(int companyNum) {
		this.companyNum = companyNum;
	}
	public boolean isAuthority() {
		return authority;
	}
	public void setAuthority(boolean authority) {
		this.authority = authority;
	}
	
	
}
