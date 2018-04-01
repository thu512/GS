package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1041.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박민주
* @프로그램 설명           : 
*/
public class Intern_1041 {

	public static void main(String[] args) {
		
		Intern_1041 intern1 = new Intern_1041();
		Intern_1041 intern2 = new Intern_1041("박민주");
		Intern_1041 intern3 = new Intern_1041("박민주", 26);
		Intern_1041 intern4 = new Intern_1041("박민주", 26, "칼텍스");
		
		System.out.println(intern1.name);
		System.out.println(intern2.name);
		System.out.println(intern2.site);
		System.out.println(intern4.age);
	}
	
	String name;
	int age;
	String site;
	
	Intern_1041(){
		
	}
	
	Intern_1041(String name){
		this(name, 26, "칼텍스" );
	}
	
	Intern_1041(String name, int age){
		this(name,age,"칼텍스");
	}
	Intern_1041(String name, int age, String site){
		this.name = name;
		this.age =	age;
		this.site = site;
	}
}

 
