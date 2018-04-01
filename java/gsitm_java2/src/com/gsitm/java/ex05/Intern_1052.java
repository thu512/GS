package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박보미
* @프로그램 설명           : 클래스 생성자 만들기  
*/
public class Intern_1052 {

	private String name;
	private int age;
	private String apply;

	public Intern_1052() {
	}

	public Intern_1052(String name) {
		this(name, 25, "SI");
	}

	public Intern_1052(String name, int age) {
		this(name, age, "SI");
	}

	public Intern_1052(String name, int age, String apply) {
		this.name = name;
		this.age = age;
		this.apply = apply;
	}

	public static void main(String[] args) {
		Intern_1052 intern = new Intern_1052("박보미", 25, "SI");
	}

}
