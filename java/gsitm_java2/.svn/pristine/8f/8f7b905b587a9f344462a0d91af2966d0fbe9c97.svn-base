package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자                : 김수진
* @프로그램 설명           : 생성자 만드는 연습하는 프로그램입니다.
*/
public class Intern_1032 {

	String name;
	int age;
	String wantSite;
	
	//생성자
	Intern_1032(){
		
	}
	Intern_1032(String name){
		this(name, 26, "역삼타워");  //다른 생성자 호출
	}
	Intern_1032(String name, int age){
		this(name, age, "역삼타워");
	}
	Intern_1032(String name, int age, String wantSite){  //공통실행코드
		this.name = name;
		this.age = age;
		this.wantSite = wantSite;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1032 intern1 = new Intern_1032();
		System.out.println(intern1.name);
		Intern_1032 intern2 = new Intern_1032("김수진");
		System.out.println(intern2.name+" "+intern2.age+" "+intern2.wantSite);
		Intern_1032 intern3 = new Intern_1032("김수진", 26);
		System.out.println(intern3.name+" "+intern3.age+" "+intern3.wantSite);
		Intern_1032 intern4 = new Intern_1032("김수진", 26, "역삼타워, 리테일");
		System.out.println(intern4.name+" "+intern4.age+" "+intern4.wantSite);
	}
}
