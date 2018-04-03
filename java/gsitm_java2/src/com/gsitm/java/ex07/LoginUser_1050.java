package com.gsitm.java.ex07;
/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: LoginUser_1050.java 
* @Project				: gsitm_java 
* @Date					: 2018. 4. 2. 
* @작성자					: 우연찬
* @프로그램 설명			: 1. 싱글톤을 구현한 LoginUser_1050 클래스를 생성하고,
						  2. 외부 클래스 Menu_1050 에서 LoginUser_1050의 이름, 사번을 얻어낼 수 있도록 합니다.
						  3. LoginUser_1050 멤버변수로 이름, 사번을 갖습니다.
*/
public class LoginUser_1050 {
	private String name="";
	private int ID=0;
	private String authorization="";
	
	private static LoginUser_1050 singleton = new LoginUser_1050();
	//다른 페이지에서 클래스에서 사용할 때, 객체를 굳이 또 만들필요 없이 계속 하나의 객체로 쓸라고,
	// 계속해서 인스턴스를 생성하면 낭비야. ㅇㅋ? 이것이 싱글톤이다. 
	private LoginUser_1050() {
		this.name="우연찬";
		this.ID=1050;
		this.authorization="인턴";
	}
	static LoginUser_1050 getInstance() {
		return singleton;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	
}
