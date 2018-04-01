package com.gsitm.java.ex05;

/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Intern_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 3. 30. 
* @작성자			    : 신종욱
* @프로그램 설명       : 생산자 오버로딩
*/
public class Intern_1048 {

	String name;
	String site;
	int age;

	Intern_1048(String name) {
		this.name = name;
	}

	Intern_1048(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Intern_1048(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}

	void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(site);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1048 shin = new Intern_1048("shin", 27, "GS SHOP");
		shin.printInfo();

	}
}
