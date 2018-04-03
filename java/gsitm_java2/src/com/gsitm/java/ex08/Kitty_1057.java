package com.gsitm.java.ex08;

/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : Kitty_1057.java 
* @Project              : gsitm_java2 
* @Date                 : 2018. 4. 3. 
* @작성자                 : 이융성
* @프로그램 설명            : Cat(엄마고양이)를 상속받아 만든 Kitty(아기고양이) 클래스
*/
public class Kitty_1057 extends Cat_1057 {
	@Override
	public void makeSound() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		Cat_1057 cat = new Cat_1057();
		Kitty_1057 kitty = new Kitty_1057();
		
		cat.makeSound();
		kitty.makeSound();
	
				
	}
}
