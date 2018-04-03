package com.gsitm.java.ex08;

/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : Cat_1057.java 
* @Project              : gsitm_java2 
* @Date                 : 2018. 4. 3. 
* @작성자                 : 이융성
* @프로그램 설명            : Kitty(아기고양이)클래스에 상속해줄 Cat(엄마고양이) 클래스
*/
public class Cat_1057 {
	
	private String hairColor;
	public int arm;
	public int leg;
	public int shoulder;
	
	public void makeSound() {
		System.out.println("냐옹");
	}
	
	private boolean steal() {
		return false;
	}
	
}
