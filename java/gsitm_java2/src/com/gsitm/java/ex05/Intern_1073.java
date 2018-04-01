package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 채유진
* @프로그램 설명           : 클래스 생성자 연습
*/
public class Intern_1073 {
	String name;
	int age;
	String wish;
	
	Intern_1073() {
		 
	}
	Intern_1073(String name) {
		this(name, 26, "인프라");
	}
	Intern_1073(String name, int age){
		this(name, age, "인프라");
	}
	Intern_1073(String name, int age, String wish){
		this.name = name;//this는 멤버변수 
		//String name1 = name;
		this.age = age;
		this.wish = wish;
	}
	
	
	public static void main() {
		Intern_1073 intern = new Intern_1073("채유진", 26, "인프라");
		System.out.println(intern.name + intern.age + intern.wish);
	}
}
