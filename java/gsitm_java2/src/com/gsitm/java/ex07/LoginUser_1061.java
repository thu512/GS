package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 임혜성
* @프로그램 설명           : LoginUser는 멤버변수로 이름, 사번, 권한을 갖습니다.
						   `이름, 사번, 권한은 private으로 접근 제한되며, getter/setter를 통해 외부에서 읽고 쓸 수 있다.
*/
public class LoginUser_1061 {
	private String name = "임혜성";
	private int empNo = 1061;
	private String admin = "사원";

	private static LoginUser_1061 singleton = new LoginUser_1061();
	
	private LoginUser_1061() {}
	
	static LoginUser_1061 getInstance() {
		return singleton;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
}
