package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/

public class LoginUser_1035 {
	//1개의 인스턴스 생성
	private static LoginUser_1035 singleton = new LoginUser_1035();
	
	//오직 getter,setter 만 접근할수있도록 private 처리 
	private String name;
	private int idNumber;
	private String auth;
	
	//생성자 private
	private LoginUser_1035() {}
	
	//싱글톤 얻기위한 메서드
	static LoginUser_1035 getInstance() {
		return singleton;
	}
	
	//getter,setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	


}
