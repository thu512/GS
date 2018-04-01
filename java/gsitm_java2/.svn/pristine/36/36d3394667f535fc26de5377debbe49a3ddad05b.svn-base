package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 임혜성
* @프로그램 설명           : 멤버변수 : 이름, 나이, 지망사이트
*							디폴트 생성자
*							이름
*							이름, 나이
*							이름, 나이, 지망 
*/
public class Intern_1061 {
	private String name = "임혜성";
	private int age = 28;
	private String site = "GS칼텍스";
	
	//getter & setter
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	//디폴트 생성자
	public Intern_1061() {}
	//이름
	public Intern_1061(String name) {
		this.name = name;
	}
	//이름, 나이
	public Intern_1061(String name, int age) {
		/*
		this.name = name;
		this.age = age;
		*/
		//다른 생성자를 호출함, 즉 밑에 있는 생성자를 호출하는 것
		this(name, age, "GS칼텍스");
	}
	//이름, 나이, 사이튼
	public Intern_1061(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}
	
	@Override
	public String toString() {
		return "Intern_1061 [name=" + name + ", age=" + age + ", site=" + site + "]";
	}
	
	public static void main(String [] args) {
		Intern_1061 intern1 = new Intern_1061();
		Intern_1061 intern2 = new Intern_1061("임혜성");
		Intern_1061 intern3 = new Intern_1061("임혜성", 28);
		Intern_1061 intern4 = new Intern_1061("임혜성", 28, "GS칼텍스");
	}
}
