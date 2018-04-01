package com.gsitm.java.ex05;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Intern_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 이상훈
* @프로그램 설명			: 이름, 나이, 희망 사이트를 생성자로 나타내는 프로그램 (+ 추가로 getter/setter도 만들어봄)
*/
public class Intern_1056 {
	private String name;
	private int age;
	private String wantSite;
	
	
	// default
	public Intern_1056() {
		this.name = "철수";
		this.age = 0;
		this.wantSite = "미정";
	}
	
	// overloading
	public Intern_1056(String name) {
		this();
		this.name = name;
	}
	
	// overloading
	public Intern_1056(String name, int age) {
		this(name);
		this.age = age;
	}
	
	// overloading
	public Intern_1056(String name, int age, String wantSite) {
		this(name, age);
		this.wantSite = wantSite;
	}

	// getter and setter
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

	public String getWantSite() {
		return wantSite;
	}

	public void setWantSite(String wantSite) {
		this.wantSite = wantSite;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + ", Age: " + getAge() + ", WantSite: " + getWantSite();
	}
	
	// main
	public static void main(String[] args) {
		Intern_1056 intern1 = new Intern_1056();	// 기본 생성자
		Intern_1056 intern2 = new Intern_1056("이상훈");	// 이름 생성자
		Intern_1056 intern3 = new Intern_1056("이상훈", 29);	// 이름, 나이 생성자
		Intern_1056 intern4 = new Intern_1056("이상훈", 29, "SI");	// 이름, 나이, 희망사이트  생성자
		
		System.out.println(intern1);
		System.out.println(intern2);
		System.out.println(intern3);
		System.out.println(intern4);
	}
	
	
}
