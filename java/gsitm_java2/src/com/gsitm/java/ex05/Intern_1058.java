package com.gsitm.java.ex05;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: Intern_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 3. 30. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class Intern_1058 {

	String name;
	String age;
	String target;

	Intern_1058(){
		this("이인성","25","SI");
	}
	Intern_1058(String name){
		this(name,"25","SI");
	}
	Intern_1058(String name, String age){
		this(name,age,"SI");
	}
	Intern_1058(String name, String age, String target){
		this.name = name;
		this.age = age;
		this.target = target;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1058 newItem = new Intern_1058();
		System.out.println(newItem.name);
	}

}
