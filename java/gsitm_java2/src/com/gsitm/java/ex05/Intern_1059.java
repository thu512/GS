package com.gsitm.java.ex05;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자              : 이종건
* @프로그램 설명       : 멤버변수 : 이름, 나이, 지밍사이트
*						
*						 디폴트 생성자
*						 이름
*						 이름, 나이
*						 이름, 나이, 지망
*						 this를 이용한 생성자 호출.
*/

public class Intern_1059 {

	String name;
	int age;
	String wantSite;
	
	// 디폴트 생성자
	Intern_1059() {}
	
	Intern_1059(String name) {
		this(name, 27, "SI");
	}
	
	Intern_1059(String name, int age) {
		this(name, age, "SI");
	}
	
	Intern_1059(String name, int age, String wantSite) {
		this.name = name;
		this.age = age;
		this.wantSite = wantSite;
	}
	
	public static void main(String[] args) {
		Intern_1059 person1 = new Intern_1059(); // 디폴트 생성자
		Intern_1059 person2 = new Intern_1059("이종건");
		Intern_1059 person3 = new Intern_1059("이종건", 27);
		Intern_1059 person4 = new Intern_1059("이종건", 27, "SI");
		
	}

}
