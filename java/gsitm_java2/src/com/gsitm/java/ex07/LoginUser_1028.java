package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 강혜정
* @프로그램 설명           : 싱글톤 사용
*/
public class LoginUser_1028 {
	private  String name = "강혜정"; 
	private  String num = "1028";
	private  String autho = "권한없음";
	
	//정적 필드
	private static LoginUser_1028 singleton = new LoginUser_1028(); 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAutho() {
		return autho;
	}

	public void setAutho(String autho) {
		this.autho = autho;
	}

	//생성자
	private LoginUser_1028() {
		
	}
	
	//정적 메소드
	static LoginUser_1028 getInstance() {
		return singleton;
	}
	
	
}
