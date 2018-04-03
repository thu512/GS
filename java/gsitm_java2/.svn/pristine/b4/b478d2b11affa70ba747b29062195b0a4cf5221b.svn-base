package com.gsitm.java.ex07;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 이름, 사번, 권한 멤버변수를 갖는 singleton 클래스
*/
public class LoginUser_1077 {
	// 프로퍼티 선언
	private String 이름 = "허빛찬샘";
	private String 사번 = "IT 1077";
	private String 권한 = "관리자";
	
	// getter setter
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get사번() {
		return 사번;
	}
	public void set사번(String 사번) {
		this.사번 = 사번;
	}
	public String get권한() {
		return 권한;
	}
	public void set권한(String 권한) {
		this.권한 = 권한;
	}

	//싱글톤
	private static LoginUser_1077 singleton = new LoginUser_1077();
	
	//싱글톤 생성자
	private LoginUser_1077() {}
	static LoginUser_1077 getInstance() {
		return singleton;
	}//LoginUser_1077
	
}//class
