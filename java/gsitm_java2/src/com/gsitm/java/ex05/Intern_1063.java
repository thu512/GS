package com.gsitm.java.ex05;

public class Intern_1063 {
	//필드
	String name;
	int age;
	String hope;
	
	//디폴트 생성자
	Intern_1063(){
		
	}
	//
	Intern_1063(String name){
		this(name,25,"gs칼텍스");
	}
	Intern_1063(String name, int age){
		this(name,age,"gs칼텍스");
	}
	Intern_1063(String name, int age, String hope){
		this.name = name;
		this.age = age;
		this.hope = hope;
	}
	
	@Override
	public String toString() {
		return "Intern_1063 [name=" + name + ", age=" + age + ", hope=" + hope + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1063 intern = new Intern_1063("유희수", 25,"gs칼텍스");
		System.out.println(intern.toString());
	}

}
