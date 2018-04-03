/**
 * 
 */
package com.gsitm.java.ex07;

/**
 *    @과목명 : GS ITM 인턴사원 자바교육  
 *    @FileName : LoginUser_1044.java  
 *    @Project : gsitm_java2  
 *    @Date : 2018. 4. 2.   
 *    @작성자 : 성동원  
 *    @프로그램 설명 : 싱글톤을 구현한 클래스. 객체를 new를 통해 접근하는게 아닌, 내부 함수를 통한 접근으로 하나만을 만들 수 있다.
 */
public class LoginUser_1044 {
	private static LoginUser_1044 singleton = new LoginUser_1044();
	private String name = "dongwon";
	private int number = 1044;
	private String author = "관리자";

	/**
	 * 기본 생성자를 private를 함으로써, new를 통한 생성을 불가하게 한다.
	 */
	private LoginUser_1044() {
		// TODO Auto-generated constructor stub
	}

	// 객체를 사용하기 위한 함수
	public static LoginUser_1044 getInstance() {
		return singleton;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
