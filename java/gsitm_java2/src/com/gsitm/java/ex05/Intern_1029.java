package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 고하윤
* @프로그램 설명           : 생성자 실습
*/
public class Intern_1029 {

	private String name;
	private int age;
	private String site;
	
	//생성자
	Intern_1029() {}
	
	Intern_1029(String name) {
		this(name, 26, "retail");
	}

	Intern_1029(String name, int age) {
		this(name, age, "retail");
	}
	
	Intern_1029(String name, int age, String site) {
		super();
		this.name = name;
		this.age = age;
		this.site = site;
	}

	public static void main(String[] args) {
		Intern_1029 intern = new Intern_1029();
	}
}
