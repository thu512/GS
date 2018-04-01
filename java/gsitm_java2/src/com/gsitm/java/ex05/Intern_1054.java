package com.gsitm.java.ex05;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: Intern_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 3. 30. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 클래스 생성자 실습
*/
public class Intern_1054 {

	//fields
	private String internName;
	private int internAge;
	private String preferSite;
	
	/**
	 * Default Constructor
	 */
	public Intern_1054() {
		super();
		this.internName = "이경민";
		this.internAge = 27;
		this.preferSite = "아무데나";
	}
	/**Constructor
	 * @param internName
	 */
	public Intern_1054(String internName) {
		super();
		this.internName = internName;
		this.internAge = 27;
		this.preferSite = "아무데나";
	}
	/**Constructor
	 * @param internName
	 * @param internAge
	 */
	public Intern_1054(String internName, int internAge) {
		super();
		this.internName = internName;
		this.internAge = internAge;
		this.preferSite = "아무데나";
	}
	/**Constructor
	 * @param internName
	 * @param internAge
	 * @param preferSite
	 */
	public Intern_1054(String internName, int internAge, String preferSite) {
		super();
		this.internName = internName;
		this.internAge = internAge;
		this.preferSite = preferSite;
	}
	/*
	 * 필드 출력 메소드
	 * */
	public void printInternInfo() {
		System.out.println("이름 : " + this.internName + "" + this.internAge + "" + this.preferSite );
	}
	/**
	 * @return the internName
	 */
	public String getInternName() {
		return internName;
	}
	/**
	 * @param internName the internName to set
	 */
	public void setInternName(String internName) {
		this.internName = internName;
	}
	/**
	 * @return the internAge
	 */
	public int getInternAge() {
		return internAge;
	}
	/**
	 * @param internAge the internAge to set
	 */
	public void setInternAge(int internAge) {
		this.internAge = internAge;
	}
	/**
	 * @return the preferSite
	 */
	public String getPreferSite() {
		return preferSite;
	}
	/**
	 * @param preferSite the preferSite to set
	 */
	public void setPreferSite(String preferSite) {
		this.preferSite = preferSite;
	}
	
}

