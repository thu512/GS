package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : intern_1065.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정광수
* @프로그램 설명           :  생성자 연습 this()연산자 사용
*/
public class intern_1065 {

	private String name;
	private int age;
	private String hopeSite;

	public intern_1065() {
		System.out.println("intern_1065()호출");
	}

	public intern_1065(String name) {
		this.name=name;
		System.out.println("intern_1065(String name)호출");
	}

	public intern_1065(String name, int age) {
 		this.age = age;
		System.out.println("intern_1065(String name, int age)호출");
	}

	public intern_1065(String name, int age, String hopeSite) {
		this(name,age);
		this.hopeSite = hopeSite;
		System.out.println("intern_1065(String name, int age, String hopeSite)호출");
	}

	// Getter Setter
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

	public String getHopeSite() {
		return hopeSite;
	}

	public void setHopeSite(String hopeSite) {
		this.hopeSite = hopeSite;
	}

	public static void main(String[] args) {
		intern_1065 person = new intern_1065("정광수",27,"칼텍스");
		System.out.println(person);
	}

	@Override
	public String toString() {
		return "intern_1065 [name=" + name + ", age=" + age + ", hopeSite=" + hopeSite + "]";
	}
	
	
}
