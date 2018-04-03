package com.gsitm.java.ex07;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : LoginUser_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 2. 
 * @작성자            : 송현석
 * @프로그램 설명                : idnum이라는 사번과 name이라는 이름, authen이라는 권한에 관련된 각 변수들을
 * 					맴버로 가지는 싱글톤 패턴의 객체를 만드는 클래스. 생성자가 private이므로 자기 자신밖에 호출 할 수
 * 					없으므로, 자기 자신이 한번만 호출한 후 getInstance를 통해 인스턴스의 참조를 넘긴다.
 */
public class LoginUser_1047 {
	private static LoginUser_1047 singleton = new LoginUser_1047();//한번만 자기자신 객체 생성.

	private int idNum = 0;
	private String authen = "";
	private String name = "";
	
	public String getName() {// getters and setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String getAuthen() {
		return authen;
	}

	public void setAuthen(String authen) {
		this.authen = authen;
	}
	
	private LoginUser_1047() {//private 생성자. 이것은 자기자신밖에 참조할 수 없으므로, 자신이 호출하는 횟수 만큼의 객체만 존재할 수 있다.
		idNum = 0;
		authen = "";
		name = "";
	}
	
	static LoginUser_1047 getInstance() { //외부에서 이 객체를 얻는 유일한 방법은 이 메소드를 호출하는것 뿐이다.
		return singleton;
	}
}
