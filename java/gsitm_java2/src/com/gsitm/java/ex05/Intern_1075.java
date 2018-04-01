package com.gsitm.java.ex05;

/**
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Intern_1075.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 30.
 * @작성자			: 최영롱
 * @프로그램 설명	: this() 코드르 사용해서 생성자를 정의하고, 오버로딩한다.
 */
public class Intern_1075 {
	
	String name;
	int age;
	String applySite;
	
	Intern_1075(){
		
	}
	
	@Override
	public String toString() {
		return "Intern_1075 [name=" + name + ", age=" + age + ", applySite=" + applySite + "]";
	}

	Intern_1075(String name){
		this(name, 26, "역삼도좋고");
	}
	
	Intern_1075(String name, int age){
		this(name, age, "강서도좋고");
	}
	
	Intern_1075(String name, int age, String applySite){
		this.name = name;
		this.age = age;
		this.applySite = applySite;
	}
	
	public static void main(String[] args) {
		Intern_1075 intern1 = new Intern_1075("rong");
		Intern_1075 intern2 = new Intern_1075("rong", 26);
		Intern_1075 intern3 = new Intern_1075("rong", 26, "사이트도좋다");
		
		System.out.println(intern1);
		System.out.println(intern2);
		System.out.println(intern3);
	}
}