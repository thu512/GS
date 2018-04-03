package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 유희수
* @프로그램 설명           : 싱글턴을 구현한 loginUser 사번 클래스를 생성하고, private 접근제한자로  이름,사번,권한 멤버변수를 getter/setter를 통해 외부에서 읽고 쓰기.
*/
public class LoginUser_1063 {
	
	private String name="";
	private int num = 0;
	private boolean right = false;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	//정적 필드
	private static LoginUser_1063 singleton = new LoginUser_1063();
	
	//생성자
	private LoginUser_1063() {
		this.name = "유희수";
		this.num = 1063;
		this.right = true;
	}
	
	//정적메소드
	static LoginUser_1063 getInstance() {
		return singleton;
	}
}
