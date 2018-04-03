package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Kitty_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손혜성
* @프로그램 설명           : 클래스 상속(새끼고양이) 
*/
public class Kitty_1046 extends Cat_1046 {
	
	@Override
	public void cry() {
		System.out.println("새끼 고양이");
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		Cat_1046 cat = new Cat_1046();
		Kitty_1046 kitty = new Kitty_1046();
		
		cat.cry();
		kitty.cry();
		
		//cat.steal() 접근 불가
	}
}
