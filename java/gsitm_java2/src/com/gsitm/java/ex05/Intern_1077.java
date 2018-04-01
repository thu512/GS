package com.gsitm.java.ex05;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 생성자 이용해 볼 수 있는 예제.
*/
public class Intern_1077 {
	
	String name;
	int age;
	String site;
	
	Intern_1077(){
		this("허빛찬샘", 20, "GS리테일");
	}
	Intern_1077(String name){
		this(name, 20, "GS리테일");
	}
	Intern_1077(String name, int age){
		this(name, age, "GS리테일");
	}
	Intern_1077(String name, int age, String site){
		this.name = name;
		this.age = age;
		this.site = site;
	}

	public static void main(String[] args) {
		Intern_1077 i = new Intern_1077();
		Intern_1077 j = new Intern_1077("찬새미");
		Intern_1077 k = new Intern_1077("찬새미",19);
		Intern_1077 w = new Intern_1077("찬새미",19,"GS칼텍스");
		System.out.println(i.site+"에 가고싶습니다");
		System.out.println(j.name+"입니다");
		System.out.println(k.age+"살 입니다");
		System.out.println(w.site+"에 가고싶습니다");
	}

}
