package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박소현
* @프로그램 설명           : 생성자 메소드 
*/
public class Intern_1042 {

	String name;
	int age;
	String cite;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCite() {
		return cite;
	}

	public void setCite(String cite) {
		this.cite = cite;
	}

	Intern_1042() {
	}

	Intern_1042(String name) {
		this(name, 24, "SI");
	}

	Intern_1042(String name, int age) {
		this(name, age, "SI");
	}

	Intern_1042(String name, int age, String cite) {
		this.name = name;
		this.age = age;
		this.cite = cite;
	}

	
	@Override
	public String toString() {
		return "Intern_1042 [name=" + name + ", age=" + age + ", cite=" + cite + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1042 intern_1 = new Intern_1042("박소현");

		System.out.println(intern_1.toString());

		System.out.println("------------------------------------");

		Intern_1042 intern_2 = new Intern_1042("유희수", 25);

		System.out.println(intern_2.toString());

		System.out.println("------------------------------------");

		Intern_1042 intern_3 = new Intern_1042("조은솔", 25, "gs홈쇼핑");

		System.out.println(intern_3.toString());
		
		System.out.println("------------------------------------");

		Intern_1042 intern_4 = new Intern_1042();

		System.out.println(intern_4.toString());
	}
}
