package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : Intern_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 장동주
 * @프로그램 설명      : 생성자와 생성자오버로딩 활용
 */
public class Intern_1062 {

	String name;
	int age;
	String site;
	
	Intern_1062(){
		
	}
	Intern_1062(String name){
		this(name,27,"ERP");
	}
	Intern_1062(String name, int age){
		this(name, age, "ERP");
	}
	
	Intern_1062(String name, int age, String site){
		this.name=name;
		this.age=age;
		this.site=site;
	}
	
	public static void main(String[] args) {
		Intern_1062 intern_1062= new Intern_1062();
		System.out.println("intern_1062.name : "+ intern_1062.name);
		System.out.println();
		
		Intern_1062 intern_10622= new Intern_1062("장동주");
		System.out.println("intern_10622.name : "+ intern_10622.name);
		System.out.println();
		
		Intern_1062 intern_10623= new Intern_1062("장동주", 28);
		System.out.println("intern_10622.name : "+ intern_10623.name);
		System.out.println("intern_10622.age : "+ intern_10623.age);
		System.out.println();
		
		Intern_1062 intern_10624= new Intern_1062("장동주", 28, "ERP");
		System.out.println("intern_10622.name : "+ intern_10624.name);
		System.out.println("intern_10622.age : "+ intern_10624.age);
		System.out.println("intern_10622.name : "+ intern_10624.site);
		System.out.println();
	}

}
