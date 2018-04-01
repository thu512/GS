package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 은종현
* @프로그램 설명           : 생성자 만들기 예제
*/
public class Intern_1053 {

	private String name;
	private int age;
	private String site;

	public Intern_1053() {
		this.name = "은종현";
		this.age = 27;
		this.site = "칼텍스";
	}

	public Intern_1053(String name) {
		this.name = name;
		this.age = 27;
		this.site = "칼텍스";
	}

	public Intern_1053(String name, int age) {
		this.name = name;
		this.age = age;
		this.site = "칼텍스";
	}

	public Intern_1053(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.site = dept;
	}

	public static void main(String[] args) {
		String name = "은종현";
		int age = 27;
		String site = "칼텍스";

		Intern_1053 e1 = new Intern_1053();
		Intern_1053 e2 = new Intern_1053(name);
		Intern_1053 e3 = new Intern_1053(name, age);
		Intern_1053 e4 = new Intern_1053(name, age, site);
	}

}
