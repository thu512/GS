package com.gsitm.java.ex05;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : ScannerUpper_1033.java 
 * @Project         : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ������ �����غ���
 */
public class Intern_1033 {

	String name;
	int age;
	String apply;
	
	Intern_1033() { //����Ʈ ������
		
	}
	
	Intern_1033(String name) {
		this.name = name;
		this.age = 26;
		this.apply = "SM";
	}
	
	Intern_1033(String name, int age) {
		this.name = name;
		this.age = age;
		this.apply = "SM";
	}
	
	Intern_1033(String name, int age, String apply) {
		this.name = name;
		this.age = age;
		this.apply = apply;
	}
	
	public static void main(String[] args) {
		Intern_1033 emp1 = new Intern_1033();
		Intern_1033 emp2 = new Intern_1033("������");
		Intern_1033 emp3 = new Intern_1033("������", 26);
		Intern_1033 emp4 = new Intern_1033("������", 26, "SM");
	}
}
