package com.gsitm.java.ex05;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Intern_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 조현우
* @프로그램 설명			: Intern_1069 클래스의 생성자와 오버로딩을 통한 개념 실습
*/
public class Intern_1069 {
	
	String name;
	int age;
	String applySite;
	
	Intern_1069() {
	}
	
	Intern_1069(String name) {
		//인자 갯수에 맞는 생성자 호출
		this(name, 28, "Commerce");
	}
	
	Intern_1069(String name, int age) {
		// 인자갯수에 맞는 생성자 호출
		this(name, age, "Commerce");
	}
	
	Intern_1069(String name, int age, String applySite) {
		//해당 인스턴스 변수 초기화
		this.name = name;
		this.age = age;
		this.applySite = applySite;
	}
	public static void main(String[] args) {
		//Intern_1069 객체 생성
		Intern_1069 itInfo = new Intern_1069("조현우");
		System.out.println(itInfo.name);
		System.out.println(itInfo.age);
		System.out.println(itInfo.applySite);
	}
}


