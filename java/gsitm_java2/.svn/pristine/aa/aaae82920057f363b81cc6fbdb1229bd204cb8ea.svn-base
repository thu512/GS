package com.gsitm.java.ex05;
/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 이창주
* @프로그램 설명       : 생성자 오버로딩 실습
*/
public class Intern_1060 {

	String name;
	int age;
	String site;

	public Intern_1060() {
	}

	public Intern_1060(String name) {
		this(name,26,"GS 리테일");
	}

	public Intern_1060(String name, int age) {
		this(name,age,"GS 리테일");
	}

	public Intern_1060(String name, int age, String site) {
		this.name=name;
		this.age=age;
		this.site=site;
	}
	
	@Override
	public String toString() {
		return "Intern_1060 [name=" + name + ", age=" + age + ", site=" + site + "]";
	}

	public static void main(String[] args) {
		Intern_1060 i = new Intern_1060("창주");
		Intern_1060 i2 = new Intern_1060("창주",25);
		Intern_1060 i3 = new Intern_1060("창주",25,"GS 칼텍스");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
	}
}
