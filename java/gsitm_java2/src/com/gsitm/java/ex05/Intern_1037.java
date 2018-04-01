package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김진우
* @프로그램 설명           : 생성자
*/
public class Intern_1037 {
	String name;
	int age;
	String site;
	
	Intern_1037() {
		this("김진우", 26, "SI");
	}
	
	Intern_1037(String name) {
		this(name, 26, "SI");
	}
	
	Intern_1037(String name, int age) {
		this(name, age, "SI");
	}
	
	Intern_1037(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1037 intern0 = new Intern_1037();
		Intern_1037 intern1 = new Intern_1037("김진우");
		Intern_1037 intern2 = new Intern_1037("김진우", 26);
		Intern_1037 intern3 = new Intern_1037("김진우", 26, "SI");
		
	}

}
