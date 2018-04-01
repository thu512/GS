package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class Intern_1035 {
	String name;
	int age;
	String site;
	
	public Intern_1035() {
		this.name = "김주승";
		this.age = 26;
		this.site = "SI";
	}

	public Intern_1035(String name) {
		this.name = name;
		this.age = 26;
		this.site = "SI";
	}

	
	public Intern_1035(String name, int age) {
		this.name = name;
		this.age  = age;
		this.site  = "SI";
	}	

	
	public Intern_1035(String name, int age , String site) {
		this.name = name;
		this.age  = age;
		this.site = site;
	}
	

	
	@Override
	public String toString() {
		return "Intern_1035 [name=" + name + ", age=" + age + ", site=" + site + "]";
	}

	
	public static void main(String[] args) {
		Intern_1035 intern1 = new Intern_1035();
		Intern_1035 intern2 = new Intern_1035("하드코딩김주승");
		Intern_1035 intern3 = new Intern_1035("하드코딩김주승",26);
		Intern_1035 intern4 = new Intern_1035("하드코딩김주승",26,"하드코딩SI");
		System.out.println(intern1);
		System.out.println(intern2);
		System.out.println(intern3);
		System.out.println(intern4);
	}

}
