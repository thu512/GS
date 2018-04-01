package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 장진영
* @프로그램 설명           : 클래스의 생성자 
*/
public class Intern_1064 {
	private String name;
	private int age;
	private String site;

	public Intern_1064() {
		this("",0,"");
	}
	public Intern_1064(String name) {
		this(name, 0, "");
	}

	public Intern_1064(String name, int age) {
		this(name, age, "");
	}
	public Intern_1064(String name, int age, String site) {
		this.name = name;
		this.age = age;
		this.site = site;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1064 intern = new Intern_1064();
		System.out.println(intern.name +","+intern.age+","+intern.site);
		
	}*/

}
