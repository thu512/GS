package com.gsitm.java.ex05;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Intern_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ������ �����ε��� ���� ���� ������ ȣ���غ���.
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
		Intern_1047 intern1 = new Intern_1047("������");
		Intern_1047 intern2 = new Intern_1047("������",27);
		Intern_1047 intern3 = new Intern_1047("������",27,"SI");
		System.out.println(intern1.name+" - "+intern1.age+"�� " + intern1.wishSite);
		System.out.println(intern2.name+" - "+intern2.age+"�� " + intern2.wishSite);
		System.out.println(intern3.name+" - "+intern3.age+"�� " + intern3.wishSite);
	}

}
