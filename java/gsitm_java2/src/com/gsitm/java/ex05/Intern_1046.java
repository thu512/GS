package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손혜성
* @프로그램 설명           : 생성자 만들기
*/
public class Intern_1046 {
	String name;
	int age;
	String apply;
	public Intern_1046() {}
	public Intern_1046(String name) {
		this(name, 25, "GSCaltex");
	}
	public Intern_1046(String name, int age) {
		this(name, age, "GSCaltex");
	}
	public Intern_1046(String name, int age, String apply) {
		this.name = name;
		this.age = age;
		this.apply = apply;
	}

	public static void main(String[] args) {
		Intern_1046 it1 = new Intern_1046();
		Intern_1046 it2 = new Intern_1046("손혜성");
		Intern_1046 it3 = new Intern_1046("손혜성", 25);
		Intern_1046 it4 = new Intern_1046("손혜성", 25, "GSCaltex");
		
	}

}