package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Intern_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 30.
 * @작성자            : 위재원
 * @프로그램 설명      		: 생성자 만들기
 */
public class Intern_1051 {
	private String name;
	private int age;
	private String site;
	
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

	public Intern_1051() {
		
	}
	
	public Intern_1051(String name) {
		this.name = name;
	}
	
	public Intern_1051(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Intern_1051(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}
	
	public static void main(String[] args) {
		Intern_1051 a = new Intern_1051();
		Intern_1051 b = new Intern_1051("위재원");
		Intern_1051 c = new Intern_1051("위재원", 213123);
		Intern_1051 d = new Intern_1051("위재원", 213123, "SI!!!!!!!!!!!");
		
		
		System.out.println(a.getName() + a.getAge() + a.getSite());
		System.out.println(b.getName() + b.getAge() + b.getSite());
		System.out.println(c.getName() + c.getAge() + c.getSite());
		System.out.println(d.getName() + d.getAge() + d.getSite());
	}
}
