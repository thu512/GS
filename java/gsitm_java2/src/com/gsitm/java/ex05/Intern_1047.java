package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Intern_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 송현석
 * @프로그램 설명                : 생성자 오버로딩을 통해 여러 생성자 호출해보기.
 */
public class Intern_1047 {

	String name;
	int age;
	String wishSite;
	Intern_1047(){
		
	}
	Intern_1047(String name){
		this(name,27,"SI");
	}
	Intern_1047(String name, int age){
		this(name,age,"SI");
	}
	Intern_1047(String name, int age, String wishSite){
		this.name = name;
		this.age = age;
		this.wishSite = wishSite;
	}
	public static void main(String[] args) {
		Intern_1047 intern1 = new Intern_1047("송현석");
		Intern_1047 intern2 = new Intern_1047("송현석",27);
		Intern_1047 intern3 = new Intern_1047("송현석",27,"SI");
		System.out.println(intern1.name+" - "+intern1.age+"살 " + intern1.wishSite);
		System.out.println(intern2.name+" - "+intern2.age+"살 " + intern2.wishSite);
		System.out.println(intern3.name+" - "+intern3.age+"살 " + intern3.wishSite);
	}

}
