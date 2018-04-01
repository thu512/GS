package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손원락
* @프로그램 설명           : 생성자 호출(이름, 나이, 지망사이트)
*/
public class Intern_1045 {
	String name = "";
	int age = 0;
	String site = "";

	Intern_1045() {

	}

	Intern_1045(String name) {
		this.name = name;
		this.age = 27;
		this.site = "SI사업부";
	}

	Intern_1045(String name, int age) {
		this.name = name;
		this.age = age;
		this.site = "SI사업부";
	}

	Intern_1045(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}

	public static void main(String[] args) {
		Intern_1045 test = new Intern_1045("손원락"); //매개변수를 이름만 받는 경우
		System.out.println(test.name + " " + test.age + " " + test.site);
		
		Intern_1045 test2 = new Intern_1045("손원락2",10); //매개변수를 이름,나이만 받는 경우
		System.out.println(test2.name + " " +test2.age + " " + test2.site);
		
		Intern_1045 test3 = new Intern_1045("손원락3",37,"이곳저곳"); //매개변수를 이름,나이,사이트 모두 받는 경우
		System.out.println(test3.name + " " + test3.age + " " + test3.site);
	}
	
}
