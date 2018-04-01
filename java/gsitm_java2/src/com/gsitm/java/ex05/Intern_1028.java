package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 강혜정
* @프로그램 설명           : 생성자 선언시, this를 사용하는 실습
*						  생성자(디폴트 포함 4개)를 만들고 main함수에서 호출하기
*/
public class Intern_1028 {
	String name;
	int age;
	String site;

	public Intern_1028() {
		this.name="강혜정";
		this.age=26;
		this.site="SM";
	}
	public Intern_1028(String name) {
		this.name=name;
		this.age=26;
		this.site="SM";
	}
	public Intern_1028(String name, int age) {
		this.name=name;
		this.age=age;
		this.site="SM";
	}
	public Intern_1028(String name, int age, String site) {
		this.name=name;
		this.age=age;
		this.site=site;
	}
	
	public static void main(String[] args) {
		String name=new String("강헤정");
		int age =26;
		String site=new String("SM");
		
		Intern_1028 i1 = new Intern_1028();
		Intern_1028 i2 = new Intern_1028(name);
		Intern_1028 i3 = new Intern_1028(name, age);
		Intern_1028 i4 = new Intern_1028(name, age, site);

	}

}
