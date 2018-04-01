package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 주형진
* @프로그램 설명           : 생성자 오버로딩 연습 프로그램
*/

public class Intern_1070 {
	private String m_name;
	private int m_age;
	private String m_site;
	
	Intern_1070(){
		this.m_name = "";
		this.m_age = 0;
		this.m_site = "";
	}
	
	Intern_1070(String name){
		this.m_name = name;
	}
	
	Intern_1070(String name, int age){
		this.m_name = name;
		this.m_age = age;
	}

	Intern_1070(String name, int age, String site){
		this.m_name = name;
		this.m_age = age;
		this.m_site = site;
	}
	
	public static void main(String[] args) {
		Intern_1070 It = new Intern_1070("주형진", 27, "anywhere");
		It.printInfo();
	}
	
	void printInfo() {
		System.out.println(this.m_name);
		System.out.println(this.m_age);
		System.out.println(this.m_site);
	}
}
