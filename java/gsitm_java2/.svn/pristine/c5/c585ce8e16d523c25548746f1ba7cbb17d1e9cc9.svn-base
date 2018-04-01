package com.gsitm.java.ex05;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: Intern_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 3. 30. 
* @작성자                	: 김동범
* @프로그램 설명			: 생성자
*/
public class Intern_1030 {
	private String name;
	private int age;
	private String wannabe;

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
	public String getWannabe() {
		return wannabe;
	}
	public void setWannabe(String wannabe) {
		this.wannabe = wannabe;
	}
	Intern_1030(){
		
	}
	Intern_1030(String name) {
		this(name, 27, "칼텍스");
	}

	Intern_1030(String name, int age) {
		this(name, age, "칼텍스");
	}

	Intern_1030(String name, int age, String wannabe) {
		this.name = name;
		this.age = age;
		this.wannabe = wannabe;
	}

	public static void main(String[] args) {
		Intern_1030 in01 = new Intern_1030("김동범",29,"si");
		Intern_1030 in02 = new Intern_1030("김동범",29);
		Intern_1030 in03 = new Intern_1030("김동범");
		System.out.println("name : "+in01.getName()+", age : "+in01.getAge()+", site : "+in01.getWannabe());
		System.out.println("name : "+in02.getName()+", age : "+in02.getAge()+", site : "+in02.getWannabe());
		System.out.println("name : "+in03.getName()+", age : "+in03.getAge()+", site : "+in03.getWannabe());
	}
}
